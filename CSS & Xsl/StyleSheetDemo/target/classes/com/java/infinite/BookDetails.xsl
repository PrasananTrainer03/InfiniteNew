<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
	<xsl:template match="/">
		<xsl:for-each select="BOOKDETAILS/BOOK">
			<xsl:sort select="TITLE" order="descending"/>
		Book Id : 
		<xsl:value-of select="@BOOKID"/> <br/>
		Title : 
		<xsl:value-of select="TITLE"/> <br/>
		First Name : 
		<xsl:value-of select="AFNAME"/> <br/>
		Last Name : 
		<xsl:value-of select="ALNAME"/> <br/>
		Price : 
		<xsl:value-of select="PRICE"/> <br/><hr/>
		</xsl:for-each>
	</xsl:template>
</xsl:stylesheet>