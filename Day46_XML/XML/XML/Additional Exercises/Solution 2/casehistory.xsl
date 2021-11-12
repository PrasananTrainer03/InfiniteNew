<?xml version="1.0"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
<xsl:template match="/">
	<xsl:apply-templates/>
</xsl:template>
<xsl:template match="/">
	<xsl:apply-templates />,
</xsl:template>
<xsl:template match="text()">
	<xsl:value-of select="."/>
</xsl:template>
<xsl:template match="EXISTINGDISEASES">
<xsl:if test="position()=last()">
.
</xsl:if>
</xsl:template>
<xsl:template match="/">
<HTML>
	<HEAD>
		<TITLE>Patient Information System</TITLE>
	</HEAD>
	<BODY>
	<H1>Case History</H1>			
		<xsl:for-each select="CASEHISTORY/PERSONALINFORMATION">					
		<B>Name:</B> <xsl:value-of select="NAME"/><br/>		
			<B>Address:</B><br/>
			HouseNumber: <xsl:value-of select="ADDRESS/HOUSENUMBER" /><br/>
	 Street:<xsl:value-of select="ADDRESS/STREET" /><br/>
	 City:<xsl:value-of select="ADDRESS/CITY" /><br/>
 State:<xsl:value-of select="ADDRESS/STATE" /><br/>
	 Zip:<xsl:value-of select="ADDRESS/ZIP" /><br/>				
	<B>Gender: </B><xsl:value-of select="GENDER" /><br/>							<B>Age:</B> <xsl:value-of select="AGE" /><br/>
		<B>Existing Diseases:</B> <xsl:apply-templates  select="EXISTINGDISEASES" />				
			</xsl:for-each>			
			<p/>
		<table border ="2">
		<tr>
	<td>
		<b>Date</b>
		</td>
		<td><b>Doctor</b></td>
		<td><b>Complain</b></td>
		<td><b>Diagnosis</b></td>
		<td><b>Prescription</b></td>
	<td><b>Next Date of Visit</b></td>
		</tr>
		<xsl:for-each  select="CASEHISTORY/CASEINFORMATION/VISITINFORMATION">
		<tr>
		<td>
		<xsl:value-of select="DATE"/>
		</td>
		<td>
		<xsl:value-of select="DOCTOR"/>
		</td>
		<td><xsl:value-of select="COMPLAIN"/></td>
		<td><xsl:value-of select="DIAGNOSIS"/></td>
		<td><xsl:value-of select="PRESCRIPTION"/></td>
		<td><xsl:value-of select="NEXTDATEOFVISIT"/></td>			</tr>
	</xsl:for-each>
	</table>
	</BODY>
</HTML>
</xsl:template>
</xsl:stylesheet>
