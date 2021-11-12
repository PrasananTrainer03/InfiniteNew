<?xml version="1.0"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
<xsl:template match="/">
	<p align="center">
	<font color="blue">
		CYBERSHOPPE PRODUCT AND ORDER DETAILS
	</font>
	</p>
	<xsl:for-each select="SUMMARY/PRODUCT">
		<B>PRODUCT ID:</B> <xsl:value-of select="@ID"/> <br/>
		NAME: <xsl:value-of select="@NAME"/> <br/>
		PRICE PER UNIT : <xsl:value-of select="@PRICE"/> 			<br/><br/>
		<xsl:for-each select="ORDER">
		<B> ORDER NUMBER: <xsl:value-of select="@ID"/> </B> 			<BR/>
		SHIPPING ADDRESS: <xsl:value-of select="SHIP_ADD"/> 			<BR/>
		TOTAL QUANTITY: <xsl:value-of select="QUANTITY"/> <br/>
		<!-- Calculate the order value by multiplying the price of the parent element (in this case, product) by the order quantity -->
		ORDER VALUE: <xsl:value-of select='(../@PRICE) * 			(QUANTITY) '/> <br/> <br/>
	</xsl:for-each>
	<HR/>
	<B> PRODUCT SALES VALUE: <xsl:value-of select='(./@PRICE) * 	sum(./ORDER/QUANTITY)'/> </B>
	<BR/>
	<HR/>
	<BR/>
</xsl:for-each>	
</xsl:template>
</xsl:stylesheet>
