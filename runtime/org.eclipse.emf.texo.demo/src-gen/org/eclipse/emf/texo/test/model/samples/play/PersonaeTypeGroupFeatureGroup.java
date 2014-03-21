package org.eclipse.emf.texo.test.model.samples.play;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

/**
 * A representation for the Feature Group '<em><b>PersonaeType.group</b></em>'.
 * <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class PersonaeTypeGroupFeatureGroup {

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> Is used to identify which
	 * feature is set in this feature group.
	 * 
	 * @generated
	 */
	public static enum Feature {
		TITLE, PERSONA, PERSONAGROUP
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> Returns only the values
	 * from the feature group which have the feature equal to the parameter.
	 * 
	 * @param featureGroup
	 *            the featureGroup List to filter
	 * @param filterByFeature
	 *            filters by this enum
	 * @return a list with instances corresponding to the feature kind
	 * @see Collections#unmodifiableList(List)
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static <T> List<T> createUnmodifiableValueList(
			List<PersonaeTypeGroupFeatureGroup> featureGroup,
			Feature filterByFeature) {
		final List<Object> result = new ArrayList<Object>();
		for (final PersonaeTypeGroupFeatureGroup group : featureGroup) {
			if (group.getFeature() == filterByFeature) {
				result.add(group.getValue());
			}
		}
		return (List<T>) Collections.unmodifiableList(result);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> Returns a single value from
	 * the feature group which has the feature equal to the parameter. The first
	 * found value is returned. If no value can be found then null is returned.
	 * 
	 * @param featureGroup
	 *            the featureGroup List to filter
	 * @param filterByFeature
	 *            filters by this enum
	 * @return an instance corresponding to the feature kind or null if not
	 *         found.
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static <T> T getSingleFeatureMapValue(
			List<PersonaeTypeGroupFeatureGroup> featureGroup,
			Feature filterByFeature) {
		for (final PersonaeTypeGroupFeatureGroup group : featureGroup) {
			if (group.getFeature() == filterByFeature) {
				return (T) group.getValue();
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> Sets a single value in a
	 * feature group, if there is already a value set in the feature for the
	 * feature in question then it is replaced by the new value.
	 * 
	 * @param featureGroup
	 *            the featureGroup List to find the value
	 * @param feature
	 *            sets this feature
	 * @param value
	 *            the value to set
	 * @generated
	 */
	public static void setSingleFeatureMapValue(
			List<PersonaeTypeGroupFeatureGroup> featureGroup, Feature feature,
			Object value) {
		for (final PersonaeTypeGroupFeatureGroup group : featureGroup) {
			if (group.getFeature() == feature) {
				group.setValue(feature, value);
				return;
			}
		}
		final PersonaeTypeGroupFeatureGroup entry = new PersonaeTypeGroupFeatureGroup();
		entry.setValue(feature, value);
		featureGroup.add(entry);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> Creates a list of group
	 * instances set with the passed feature and values.
	 * 
	 * @param feature
	 *            the feature to set
	 * @param values
	 *            the values to set as value of each group instance in the
	 *            result.
	 * @return a list with instances of this class, set with the Feature and
	 *         values
	 * @generated
	 */
	public static List<PersonaeTypeGroupFeatureGroup> createFeatureGroupList(
			Feature feature, List<?> values) {
		final List<PersonaeTypeGroupFeatureGroup> result = new ArrayList<PersonaeTypeGroupFeatureGroup>();
		for (Object value : values) {
			final PersonaeTypeGroupFeatureGroup group = new PersonaeTypeGroupFeatureGroup();
			group.setValue(feature, value);
			result.add(group);
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Basic
	@Enumerated(EnumType.STRING)
	private Feature feature = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private String title;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private String persona;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private PersonaGroupType personaGroup;

	/**
	 * @generated
	 */
	public void setFeature(Feature feature) {
		this.feature = feature;
	}

	/**
	 * @generated
	 */
	public Feature getFeature() {
		return feature;
	}

	/**
	 * Returns the value of '<em><b>title</b></em>' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>title</b></em>' feature
	 * @generated
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * Sets the '{@link PersonaeType#getTitle() <em>title</em>}' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param the
	 *            new value of the '{@link PersonaeType#getTitle() title}'
	 *            feature.
	 * @generated
	 */
	public void setTitle(String newTitle) {
		title = newTitle;
		setFeature(Feature.TITLE);
	}

	/**
	 * Returns the value of '<em><b>persona</b></em>' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>persona</b></em>' feature
	 * @generated
	 */
	public String getPersona() {
		return persona;
	}

	/**
	 * Sets the '{@link PersonaeType#getPersona() <em>persona</em>}' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param the
	 *            new value of the '{@link PersonaeType#getPersona() persona}'
	 *            feature.
	 * @generated
	 */
	public void setPersona(String newPersona) {
		persona = newPersona;
		setFeature(Feature.PERSONA);
	}

	/**
	 * Returns the value of '<em><b>personaGroup</b></em>' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>personaGroup</b></em>' feature
	 * @generated
	 */
	public PersonaGroupType getPersonaGroup() {
		return personaGroup;
	}

	/**
	 * Sets the '{@link PersonaeType#getPersonaGroup() <em>personaGroup</em>}'
	 * feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param the
	 *            new value of the '{@link PersonaeType#getPersonaGroup()
	 *            personaGroup}' feature.
	 * @generated
	 */
	public void setPersonaGroup(PersonaGroupType newPersonaGroup) {
		personaGroup = newPersonaGroup;
		setFeature(Feature.PERSONAGROUP);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of this feature map entry. The type of the returned
	 *         value is based on the feature.
	 * @see #getFeature()
	 * @generated
	 */
	public Object getValue() {
		switch (getFeature()) {
		case TITLE:
			return getTitle();
		case PERSONA:
			return getPersona();
		case PERSONAGROUP:
			return getPersonaGroup();
		default:
			throw new IllegalStateException("Feature kind " + getFeature()
					+ " is not supported for this object " + this);
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param feature
	 *            the feature to set
	 * @param the
	 *            value to set in this instance
	 * @see #getFeature()
	 * @generated
	 */
	public void setValue(Feature feature, Object value) {
		switch (feature) {
		case TITLE:
			setTitle((String) value);
			break;
		case PERSONA:
			setPersona((String) value);
			break;
		case PERSONAGROUP:
			setPersonaGroup((PersonaGroupType) value);
			break;
		default:
			throw new IllegalStateException("Feature kind " + getFeature()
					+ " is not supported for this object " + this);
		}
	}
}
