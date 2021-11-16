<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
	<xsl:template match="AUTHOR">
		<xsl:value-of select="FIRSTNAME" /> 
		<xsl:value-of select="LASTNAME" /> 
		<xsl:if test="position()!= last()">,</xsl:if>
	</xsl:template>
	<TABLE BORDER="3">
<tr>
<TH> BOOK ID </TH>
<TH> TITLE </TH>
<TH> RATE </TH>
<TH> AUTHOR(S) </TH>
</tr>
	<xsl:template match="/">
	<xsl:for-each select="BOOKS/BOOK">
		<TR>
<TD><font color="red">
<xsl:value-of select="@BOOKID"/>
</font></TD>
<TD> <xsl:value-of select="TITLE" /> </TD>
<TD> <xsl:value-of select="RATE" /> </TD>
<TD> <xsl:apply-templates select="AUTHOR" /> </TD>
</TR>
</xsl:for-each>
	</xsl:template>
	</TABLE>
	
</xsl:stylesheet>