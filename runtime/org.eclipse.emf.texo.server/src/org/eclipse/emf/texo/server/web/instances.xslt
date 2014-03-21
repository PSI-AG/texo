<!-- 
/**
 * <copyright>
 *
 * Copyright (c) 2011 Springsite BV (The Netherlands) and others
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
 * $Id: instances.xslt,v 1.3 2011/09/14 15:35:48 mtaal Exp $
 */
 -->
<xsl:stylesheet version = '1.0'
	xmlns:xsl='http://www.w3.org/1999/XSL/Transform'
	xmlns:texo='http://www.eclipse.org/emf/texo/xml/model/texo_extensions'>
     
<xsl:param name="eClassName" />     
<xsl:param name="qualifiedEClassName" />
     
<xsl:template match="/">
<xsl:for-each select="*"> 
<html>
	<body> 
     <h1>Instances of EClass <xsl:value-of select="$eClassName" /></h1>
     <table>
     <xsl:for-each select="data">
     	<xsl:call-template name="handleEntity"/>
     </xsl:for-each>
     </table>
	</body>
</html>
</xsl:for-each>
</xsl:template>

<xsl:template name="handleEntity">
     <xsl:variable name="href"><xsl:value-of select="$qualifiedEClassName" />/<xsl:value-of select="@texo:id"/></xsl:variable>
     <tr><td>
     <a href="{$href}?template=instance.xslt"><xsl:value-of select="@texo:title"/> (<xsl:value-of select="@texo:id"/>)</a>
     </td><td style="padding-left:20px">
     <a href="{$href}">xml</a>
     </td></tr>
</xsl:template>
</xsl:stylesheet> 