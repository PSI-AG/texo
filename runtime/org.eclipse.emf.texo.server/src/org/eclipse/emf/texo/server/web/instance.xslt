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
 * $Id: instance.xslt,v 1.4 2011/09/14 15:47:56 mtaal Exp $
 */
 -->
<xsl:stylesheet version='1.0'
	xmlns:xsl='http://www.w3.org/1999/XSL/Transform' 
	xmlns:texo='http://www.eclipse.org/emf/texo/xml/model/texo_extensions'>
	<xsl:template match="/">
		<xsl:for-each select="*">
			<xsl:call-template name="handleEntity" />
		</xsl:for-each>
	</xsl:template>
	<xsl:template name="handleEntity">
		<html>
			<body>
				<h1>
					<xsl:value-of select="name(.)" />
					(
					<xsl:value-of select="@texo:title" />
					-
					<xsl:value-of select="@texo:id" />
					)
				</h1>
				<table>
				 	<xsl:for-each select="@*">
						<xsl:call-template name="handleField" />
        			</xsl:for-each>
					<xsl:for-each select="*">
						<xsl:call-template name="handleField" />
					</xsl:for-each>
				</table>
			</body>
		</html>
	</xsl:template>
	<xsl:template name="handleField">
		<tr>
			<td width="200" style="background-color: lightgreen;vertical-align: top;">
				<xsl:value-of select="name(.)" />
			</td>
			<td style="padding-left: 10px">
				<xsl:choose>
					<xsl:when test="@texo:id">
						<xsl:call-template name="handleReference" />
					</xsl:when>
					<xsl:otherwise>
						<xsl:value-of select="." />
					</xsl:otherwise>
				</xsl:choose>
			</td>
		</tr>
	</xsl:template>
	<xsl:template name="handleManyField">
		<tr>
			<td width="200" style="background-color: lightgreen;vertical-align: top;">
				<xsl:value-of select="name(.)" />
			</td>
			<td style="padding-left: 10px">
				<xsl:for-each select="*">
					<h3>
						<xsl:value-of select="name(.)" />
						(
						<xsl:value-of select="@texo:title" />
						-
						<xsl:value-of select="@texo:id" />
						)
					</h3>
					<table>
						<xsl:for-each select="*">
							<xsl:choose>
								<xsl:when test="@texo:id">
									<xsl:call-template name="handleReference" />
								</xsl:when>
								<xsl:otherwise>
									<xsl:call-template name="handleField" />
								</xsl:otherwise>
							</xsl:choose>
						</xsl:for-each>
					</table>
				</xsl:for-each>
			</td>
		</tr>
	</xsl:template>
	<xsl:template name="handleReference">
		<xsl:variable name="href">
			<xsl:value-of select="@texo:type" />
			/
			<xsl:value-of select="@texo:id" />
		</xsl:variable>
		<a href="../{$href}?template=instance.xslt">
			<xsl:value-of select="@texo:title" />
			(
			<xsl:value-of select="@texo:id" />
			)
		</a> <a href="../{$href}">(xml)</a>
	</xsl:template>
</xsl:stylesheet>