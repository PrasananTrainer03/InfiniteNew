<?xml version="1.0"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
<xsl:template match="/">
     <xsl:for-each select="PRODUCTDATA/PRODUCT">
     <xsl:choose>
          <xsl:when test="PRICE[. &gt; 50]">
               <font color="red">
PRODUCT NAME:<xsl:value-of select="PRODUCTNAME"/><BR/>
DESCRIPTION: <xsl:value-of select="DESCRIPTION"/><BR/>
PRICE: <xsl:value-of select="PRICE"/><BR/>
QUANTITY: <xsl:value-of select="QUANTITY"/><BR/><BR/>
<HR/> <!--Displays a horizontal rule -->
               </font>
</xsl:when>
<xsl:otherwise>
<font color="green">
PRODUCT NAME:<xsl:value-of select="PRODUCTNAME"/><BR/>
DESCRIPTION: <xsl:value-of select="DESCRIPTION"/><BR/>
PRICE: <xsl:value-of select="PRICE"/><BR/>
QUANTITY: <xsl:value-of select="QUANTITY"/><BR/><BR/>
<HR/>
</font>
</xsl:otherwise>
</xsl:choose>
</xsl:for-each>
</xsl:template>
</xsl:stylesheet>
