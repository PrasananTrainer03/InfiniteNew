<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
	<xsl:template match="/">
		<xsl:for-each select="PRODUCTDATA/PRODUCT">
			<xsl:sort select="@PRODID" order="descending"/>
			Product Id : 
			<xsl:value-of select="@PRODID"/> <br/>
			Product Name : 
			<xsl:value-of select="PRODUCTNAME"/> <br/>
			Price : 
			<xsl:value-of select="PRICE"/> <br/>
			Quantity : 
			<xsl:value-of select="QUANTITY"/> <hr/>
		</xsl:for-each>
	</xsl:template>
</xsl:stylesheet>