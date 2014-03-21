/**
 * <copyright>
 *
 * Copyright (c) 2010 Springsite BV (The Netherlands) and others
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Martin Taal - Initial API and implementation
 *
 * </copyright>
 *
 * $Id: ProjectPropertyPage.java,v 1.6 2011/09/24 06:48:00 mtaal Exp $
 */
package org.eclipse.emf.texo.eclipse.properties;

import java.util.Properties;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.emf.texo.eclipse.Messages;
import org.eclipse.emf.texo.eclipse.ProjectPropertyUtil;
import org.eclipse.emf.texo.eclipse.nature.TexoAutoCodeGenerator;
import org.eclipse.emf.texo.generator.EclipseGeneratorUtils;
import org.eclipse.jface.preference.PreferencePage;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.TabFolder;
import org.eclipse.swt.widgets.TabItem;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.dialogs.ElementTreeSelectionDialog;
import org.eclipse.ui.dialogs.PropertyPage;

/**
 * PropertyPage for Texo project properties. Controls the output location.
 * 
 * @author mtaal
 */
public class ProjectPropertyPage extends PropertyPage {

  private static final int TEXT_FIELD_WIDTH = 50;

  private Text targetProjectText;
  private Button targetProjectButton;

  private Text outputFolderText;
  private Button outputFolderButton;

  private Text templateFolderText;
  private Button templateFolderButton;

  private Button autoGenButton;
  private Button daoGenButton;
  private Button jpaGenButton;

  private Button addOrderColumnToListMappingsButton;
  private Button enforceUniqueNamesButton;
  private Button renameSQLReservedNamesButton;
  private Button generateFullDbSchemaNamesButton;
  private Text maximumSqlNameLengthScale;

  private Text modelFolderText;
  private Button modelFolderButton;

  private IProject project;

  private ModifyListener listener = new ModifyListener() {
    public void modifyText(ModifyEvent e) {
      getApplyButton().setEnabled(true);
    }
  };

  /**
   * Constructor for Property page.
   */
  public ProjectPropertyPage() {
    super();
  }

  private void setTargetProject(IProject project) {
    if (project == null) {
      targetProjectText.setText(null);
    } else {
      targetProjectText.setText(project.getName());
    }
  }

  private void setOutputFolder(IFolder outputFolder) {
    if (outputFolder == null) {
      outputFolderText.setText(project.getProjectRelativePath()
          .append(ProjectPropertyUtil.GEN_OUTPUT_FOLDER_PROPERTY_DEFAULT).toPortableString());
    } else {
      outputFolderText.setText(outputFolder.getProjectRelativePath().toPortableString());
    }
  }

  private void setTemplateFolder(IFolder templateFolder) {
    if (templateFolder == null) {
      templateFolderText.setText(null);
    } else {
      templateFolderText.setText(templateFolder.getProjectRelativePath().toPortableString());
    }
  }

  private void setModelFolder(IFolder modelFolder) {
    if (modelFolder == null) {
      modelFolderText.setText(null);
    } else {
      modelFolderText.setText(modelFolder.getProjectRelativePath().toPortableString());
    }
  }

  /**
   * @see PreferencePage#createContents(Composite)
   */
  @Override
  protected Control createContents(Composite parent) {
    final TabFolder tabFolder = new TabFolder(parent, SWT.BORDER);
    TabItem mainTab = new TabItem(tabFolder, SWT.NULL);
    mainTab.setText(Messages.getString("tab.title.generate")); //$NON-NLS-1$
    mainTab.setControl(createMainTabContent(tabFolder));

    TabItem ormMappingTab = new TabItem(tabFolder, SWT.NULL);
    ormMappingTab.setText(Messages.getString("tab.title.ormMapping")); //$NON-NLS-1$
    ormMappingTab.setControl(createORMMappingTabContent(tabFolder));
    return tabFolder;
  }

  protected Composite createORMMappingTabContent(Composite parent) {
    // private boolean addOrderColumnToListMappings = false;
    // private boolean enforceUniqueNames = false;
    // private boolean renameSQLReservedNames = false;
    // private boolean generateFullDbSchemaNames = false;
    // private int maximumSqlNameLength = -1;
    Composite mainComposite = createDefaultComposite(parent, 1);

    Composite composite = createDefaultComposite(mainComposite, 2);

    final Properties projectProps = ProjectPropertyUtil.getProjectProperties(project);

    addOrderColumnToListMappingsButton = createCheckBox(projectProps, composite,
        ProjectPropertyUtil.ORM_ADD_ORDER_COLUMN, "orm.option.add.order.column");
    enforceUniqueNamesButton = createCheckBox(projectProps, composite, ProjectPropertyUtil.ORM_ENFORCE_UNIQUE_NAMES,
        "orm.option.enforce.unique.names");
    renameSQLReservedNamesButton = createCheckBox(projectProps, composite,
        ProjectPropertyUtil.ORM_RENAME_SQL_RESERVED_NAMES, "orm.option.rename.sql.reserved.names");
    generateFullDbSchemaNamesButton = createCheckBox(projectProps, composite,
        ProjectPropertyUtil.ORM_GENERATE_FULL_DB_SCHEMA_NAMES, "orm.option.generate.full.db.schema.names");

    final Label maxSQLLabel = new Label(composite, SWT.LEFT);
    maxSQLLabel.setText(Messages.getString("orm.option.max.sql.name.length")); //$NON-NLS-1$

    maximumSqlNameLengthScale = new Text(composite, SWT.BORDER | SWT.LEFT | SWT.SINGLE);
    final GridData gridData = new GridData();
    gridData.widthHint = convertWidthInCharsToPixels(TEXT_FIELD_WIDTH);
    maximumSqlNameLengthScale.setLayoutData(gridData);
    maximumSqlNameLengthScale.setEditable(true);

    maximumSqlNameLengthScale.setText(getSafeValue(projectProps
        .getProperty(ProjectPropertyUtil.ORM_MAX_SQL_NAME_LENGTH)));
    maximumSqlNameLengthScale.addModifyListener(listener);
    maximumSqlNameLengthScale.addListener(SWT.Verify, new Listener() {
      public void handleEvent(Event e) {
        String string = e.text;
        char[] chars = new char[string.length()];
        string.getChars(0, chars.length, chars, 0);
        for (int i = 0; i < chars.length; i++) {
          if (!('0' <= chars[i] && chars[i] <= '9')) {
            e.doit = false;
            return;
          }
        }
      }
    });

    return mainComposite;
  }

  private Button createCheckBox(Properties projectProps, Composite parent, String propName, String label) {
    final Object val = projectProps.getProperty(propName);
    Button button = new Button(parent, SWT.CHECK);
    button.setText(Messages.getString(label));
    button.setSelection(val != null && val.equals("true"));
    button.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, true, 3, 1));
    button.addSelectionListener(new SelectionAdapter() {
      @Override
      public void widgetSelected(SelectionEvent e) {
        getApplyButton().setEnabled(true);
      }
    });

    return button;
  }

  protected Composite createMainTabContent(Composite parent) {
    project = ProjectPropertyUtil.getProject(getElement());

    Composite composite = new Composite(parent, SWT.NONE);
    GridLayout layout = new GridLayout();
    layout.numColumns = 1;
    composite.setLayout(layout);

    GridData data = new GridData();
    data.verticalAlignment = GridData.FILL;
    data.horizontalAlignment = GridData.FILL;
    composite.setLayoutData(data);

    createFields(composite);

    createAutoGenGroup(composite);
    return composite;
  }

  private void createFields(Composite parent) {
    final Composite composite = createDefaultComposite(parent, 3);

    final Properties projectProps = ProjectPropertyUtil.getProjectProperties(project);

    final Label projectLabel = new Label(composite, SWT.LEFT);
    projectLabel.setText(Messages.getString("project.target.label")); //$NON-NLS-1$

    targetProjectText = new Text(composite, SWT.BORDER | SWT.LEFT | SWT.SINGLE | SWT.READ_ONLY);
    final GridData projectGd = new GridData();
    projectGd.widthHint = convertWidthInCharsToPixels(TEXT_FIELD_WIDTH);
    targetProjectText.setLayoutData(projectGd);
    targetProjectText.setEditable(true);
    targetProjectText.setText(getSafeValue(projectProps.getProperty(ProjectPropertyUtil.TARGET_PROJECT_PROPERTY)));
    targetProjectText.addModifyListener(listener);

    targetProjectButton = new Button(composite, SWT.PUSH);
    targetProjectButton.setText(Messages.getString("browse")); //$NON-NLS-1$
    targetProjectButton.addSelectionListener(new SelectionAdapter() {
      @Override
      public void widgetSelected(SelectionEvent e) {
        browseTargetProject();
      }
    });

    final Label outputFolderLabel = new Label(composite, SWT.LEFT);
    outputFolderLabel.setText(Messages.getString("project.output.folder.label")); //$NON-NLS-1$

    outputFolderText = new Text(composite, SWT.BORDER | SWT.LEFT | SWT.SINGLE | SWT.READ_ONLY);
    final GridData folderGd = new GridData();
    folderGd.widthHint = convertWidthInCharsToPixels(TEXT_FIELD_WIDTH);
    outputFolderText.setLayoutData(folderGd);
    outputFolderText.setEditable(true);
    outputFolderText.setText(getSafeValue(projectProps.getProperty(ProjectPropertyUtil.OUTPUT_LOCATION_PROPERTY)));
    outputFolderText.addModifyListener(listener);

    outputFolderButton = new Button(composite, SWT.PUSH);
    outputFolderButton.setText(Messages.getString("browse")); //$NON-NLS-1$
    outputFolderButton.addSelectionListener(new SelectionAdapter() {
      @Override
      public void widgetSelected(SelectionEvent e) {
        browseOutputFolder();
      }
    });

    final Label templateFolderLabel = new Label(composite, SWT.LEFT);
    templateFolderLabel.setText(Messages.getString("project.template.folder.label")); //$NON-NLS-1$

    templateFolderText = new Text(composite, SWT.BORDER | SWT.LEFT | SWT.SINGLE | SWT.READ_ONLY);
    final GridData templateFolderGd = new GridData();
    templateFolderGd.widthHint = convertWidthInCharsToPixels(TEXT_FIELD_WIDTH);
    templateFolderText.setLayoutData(templateFolderGd);
    templateFolderText.setEditable(true);
    templateFolderText.setText(getSafeValue(projectProps.getProperty(ProjectPropertyUtil.TEMPLATES_LOCATION_PROPERTY)));
    templateFolderText.addModifyListener(listener);

    templateFolderButton = new Button(composite, SWT.PUSH);
    templateFolderButton.setText(Messages.getString("browse")); //$NON-NLS-1$
    templateFolderButton.addSelectionListener(new SelectionAdapter() {
      @Override
      public void widgetSelected(SelectionEvent e) {
        browseTemplateFolder();
      }
    });
  }

  private void createAutoGenGroup(Composite parent) {
    final Composite composite = createDefaultComposite(parent, 1);

    final Properties projectProps = ProjectPropertyUtil.getProjectProperties(project);

    Group autoGenGroup = new Group(composite, SWT.SHADOW_ETCHED_IN);
    GridLayout layout = new GridLayout();
    layout.numColumns = 3;
    autoGenGroup.setLayout(layout);
    GridData data = new GridData(GridData.FILL + GridData.GRAB_HORIZONTAL);
    data.grabExcessHorizontalSpace = true;
    autoGenGroup.setLayoutData(data);
    autoGenGroup.setText(Messages.getString("autoGenGroup"));

    autoGenButton = new Button(autoGenGroup, SWT.CHECK);
    autoGenButton.setText(Messages.getString("autoGen")); //$NON-NLS-1$
    autoGenButton.setSelection(projectProps.getProperty(ProjectPropertyUtil.ENABLE_AUTOGEN_PROPERTY) != null);
    autoGenButton.addSelectionListener(new SelectionAdapter() {
      @Override
      public void widgetSelected(SelectionEvent e) {
        enableDisableAutoGenFields(autoGenButton.getSelection());
        getApplyButton().setEnabled(true);
      }
    });
    autoGenButton.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, true, 3, 1));

    final Label modelFolderLabel = new Label(autoGenGroup, SWT.LEFT);
    modelFolderLabel.setText(Messages.getString("project.model.folder.label")); //$NON-NLS-1$

    modelFolderText = new Text(autoGenGroup, SWT.BORDER | SWT.LEFT | SWT.SINGLE | SWT.READ_ONLY);
    final GridData folderGd = new GridData();
    folderGd.widthHint = convertWidthInCharsToPixels(TEXT_FIELD_WIDTH);
    modelFolderText.setLayoutData(folderGd);
    modelFolderText.setEditable(true);
    modelFolderText.setText(getSafeValue(projectProps.getProperty(ProjectPropertyUtil.MODEL_LOCATION_PROPERTY)));
    modelFolderText.addModifyListener(listener);

    modelFolderButton = new Button(autoGenGroup, SWT.PUSH);
    modelFolderButton.setText(Messages.getString("browse")); //$NON-NLS-1$
    modelFolderButton.addSelectionListener(new SelectionAdapter() {
      @Override
      public void widgetSelected(SelectionEvent e) {
        browseModelFolder();
      }
    });

    daoGenButton = new Button(autoGenGroup, SWT.CHECK);
    daoGenButton.setText(Messages.getString("autoDaoGen")); //$NON-NLS-1$
    daoGenButton.setSelection(projectProps.getProperty(ProjectPropertyUtil.ENABLE_DAO_PROPERTY) != null);
    daoGenButton.addSelectionListener(new SelectionListener() {
      public void widgetSelected(SelectionEvent arg0) {
        getApplyButton().setEnabled(true);
      }

      public void widgetDefaultSelected(SelectionEvent arg0) {
      }
    });
    daoGenButton.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, true, 3, 1));

    jpaGenButton = new Button(autoGenGroup, SWT.CHECK);
    jpaGenButton.setText(Messages.getString("autoJpaGen")); //$NON-NLS-1$
    jpaGenButton.setSelection(projectProps.getProperty(ProjectPropertyUtil.ENABLE_JPA_PROPERTY) != null);
    jpaGenButton.addSelectionListener(new SelectionListener() {
      public void widgetSelected(SelectionEvent arg0) {
        getApplyButton().setEnabled(true);
      }

      public void widgetDefaultSelected(SelectionEvent arg0) {
      }
    });
    jpaGenButton.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, true, 3, 1));

    enableDisableAutoGenFields(autoGenButton.getSelection());

    TexoAutoCodeGenerator.addRemoveProjectBuilder(project, autoGenButton.getSelection());
  }

  private void enableDisableAutoGenFields(boolean autoGen) {
    jpaGenButton.setEnabled(autoGen);
    daoGenButton.setEnabled(autoGen);
    modelFolderButton.setEnabled(autoGen);
    modelFolderText.setEnabled(autoGen);
  }

  private void browseTargetProject() {
    final ProjectSelectionDialog selectionDialog = new ProjectSelectionDialog(Display.getCurrent().getActiveShell());
    selectionDialog.setTitle(Messages.getString("project.target.select.title")); //$NON-NLS-1$
    selectionDialog.setMessage(Messages.getString("project.target.select.message")); //$NON-NLS-1$
    selectionDialog.setBlockOnOpen(true);
    selectionDialog.setInput(project.getWorkspace().getRoot());
    selectionDialog.setInitialSelection(targetProjectText.getText());
    if (selectionDialog.open() == Window.OK) {
      setTargetProject((IProject) selectionDialog.getFirstResult());
    }
  }

  private void browseOutputFolder() {
    final ElementTreeSelectionDialog selectionDialog = new FolderSelectionDialog(Display.getCurrent().getActiveShell());
    selectionDialog.setTitle(Messages.getString("project.output.folder.select.title")); //$NON-NLS-1$
    selectionDialog.setMessage(Messages.getString("project.output.folder.select.message")); //$NON-NLS-1$
    selectionDialog.setBlockOnOpen(true);
    if (targetProjectText.getText() != null && targetProjectText.getText().trim().length() > 0) {
      selectionDialog.setInput(EclipseGeneratorUtils.getProject(targetProjectText.getText()));
    } else {
      selectionDialog.setInput(project);
    }
    selectionDialog.setInitialSelection(outputFolderText.getText());
    if (selectionDialog.open() == Window.OK) {
      setOutputFolder((IFolder) selectionDialog.getFirstResult());
    }
  }

  private void browseTemplateFolder() {
    final ElementTreeSelectionDialog selectionDialog = new FolderSelectionDialog(Display.getCurrent().getActiveShell());
    selectionDialog.setTitle(Messages.getString("project.template.folder.select.title")); //$NON-NLS-1$
    selectionDialog.setMessage(Messages.getString("project.template.folder.select.message")); //$NON-NLS-1$
    selectionDialog.setBlockOnOpen(true);
    selectionDialog.setInput(project);
    selectionDialog.setInitialSelection(templateFolderText.getText());
    if (selectionDialog.open() == Window.OK) {
      setTemplateFolder((IFolder) selectionDialog.getFirstResult());
    }
  }

  private void browseModelFolder() {
    final ElementTreeSelectionDialog selectionDialog = new FolderSelectionDialog(Display.getCurrent().getActiveShell());
    selectionDialog.setTitle(Messages.getString("project.model.folder.select.title")); //$NON-NLS-1$
    selectionDialog.setMessage(Messages.getString("project.model.folder.select.message")); //$NON-NLS-1$
    selectionDialog.setBlockOnOpen(true);
    selectionDialog.setInput(project);
    selectionDialog.setInitialSelection(modelFolderText.getText());
    if (selectionDialog.open() == Window.OK) {
      setModelFolder((IFolder) selectionDialog.getFirstResult());
    }
  }

  private Composite createDefaultComposite(Composite parent, int numColumns) {
    Composite composite = new Composite(parent, SWT.NULL);
    GridLayout layout = new GridLayout();
    layout.numColumns = numColumns;
    composite.setLayout(layout);

    GridData data = new GridData();
    data.verticalAlignment = GridData.FILL;
    data.horizontalAlignment = GridData.FILL;
    composite.setLayoutData(data);

    return composite;
  }

  @Override
  protected void performDefaults() {
    super.performDefaults();
    outputFolderText.setText(project.getProjectRelativePath()
        .append(ProjectPropertyUtil.GEN_OUTPUT_FOLDER_PROPERTY_DEFAULT).toPortableString());
    templateFolderText.setText(""); //$NON-NLS-1$
    modelFolderText.setText("");
    autoGenButton.setSelection(false);
    jpaGenButton.setSelection(false);
    daoGenButton.setSelection(false);
    enableDisableAutoGenFields(autoGenButton.getSelection());
  }

  @Override
  public boolean performOk() {
    try {
      final Properties props = new Properties();
      setProperty(props, ProjectPropertyUtil.TARGET_PROJECT_PROPERTY,
          getNullForEmptyString(targetProjectText.getText()));
      setProperty(props, ProjectPropertyUtil.TEMPLATES_LOCATION_PROPERTY,
          getNullForEmptyString(templateFolderText.getText()));
      setProperty(props, ProjectPropertyUtil.OUTPUT_LOCATION_PROPERTY,
          getNullForEmptyString(outputFolderText.getText()));
      setProperty(props, ProjectPropertyUtil.MODEL_LOCATION_PROPERTY, getNullForEmptyString(modelFolderText.getText()));
      setProperty(props, ProjectPropertyUtil.ENABLE_AUTOGEN_PROPERTY, autoGenButton.getSelection() ? "true" : null);
      setProperty(props, ProjectPropertyUtil.ENABLE_DAO_PROPERTY, daoGenButton.getSelection() ? "true" : null);
      setProperty(props, ProjectPropertyUtil.ENABLE_JPA_PROPERTY, jpaGenButton.getSelection() ? "true" : null);

      setProperty(props, ProjectPropertyUtil.ORM_ADD_ORDER_COLUMN,
          addOrderColumnToListMappingsButton.getSelection() ? "true" : "false");

      setProperty(props, ProjectPropertyUtil.ORM_ADD_ORDER_COLUMN,
          addOrderColumnToListMappingsButton.getSelection() ? "true" : "false");

      setProperty(props, ProjectPropertyUtil.ORM_ENFORCE_UNIQUE_NAMES, enforceUniqueNamesButton.getSelection() ? "true"
          : "false");

      setProperty(props, ProjectPropertyUtil.ORM_GENERATE_FULL_DB_SCHEMA_NAMES,
          generateFullDbSchemaNamesButton.getSelection() ? "true" : "false");

      setProperty(props, ProjectPropertyUtil.ORM_RENAME_SQL_RESERVED_NAMES,
          renameSQLReservedNamesButton.getSelection() ? "true" : "false");

      setProperty(props, ProjectPropertyUtil.ORM_MAX_SQL_NAME_LENGTH,
          getNullForEmptyString(maximumSqlNameLengthScale.getText()));

      ProjectPropertyUtil.setProjectProperties(project, props);

      TexoAutoCodeGenerator.addRemoveProjectBuilder(project, autoGenButton.getSelection());

    } catch (Exception e) {
      return false;
    }
    return true;
  }

  private void setProperty(Properties props, String property, String value) {
    if (value == null) {
      props.remove(property);
    } else {
      props.put(property, value);
    }

  }

  private String getNullForEmptyString(String value) {
    if (value == null) {
      return null;
    }
    if (value.trim().length() == 0) {
      return null;
    }
    return value.trim();
  }

  private String getSafeValue(String value) {
    if (value == null) {
      return ""; //$NON-NLS-1$
    }
    return value;
  }

  @Override
  protected void performApply() {
    performOk();
    getApplyButton().setEnabled(false);
  }

  @Override
  public void createControl(Composite parent) {
    super.createControl(parent);
    getApplyButton().setEnabled(false);
  }
}
