<?xml version='1.0'?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
<xsl:template match="/">
	<p align="center"><font color="blue">STUDENT DETAILS</font></p>
	<B>STUDENT ID:</B> <xsl:value-of select="MARKSSUMMARY/STUDENT/@ID"/> <br/>
	Maths Total: <xsl:value-of select='sum(//MARKSSUMMARY/STUDENT/TEST/MATHS) div 3'/> <br/>
		Science Total:<xsl:value-of select='sum(//MARKSSUMMARY/STUDENT/TEST/SCIENCE) div 3'/><br/>
		Social Total:<xsl:value-of select='sum(//MARKSSUMMARY/STUDENT/TEST/SOCIALSTUDIES) div 3'/><br/>
</xsl:template>
</xsl:stylesheet>
