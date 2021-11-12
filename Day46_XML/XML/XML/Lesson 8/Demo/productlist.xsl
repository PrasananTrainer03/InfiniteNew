<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
<xsl:template match="/">
 <html>
 <body>
  <xsl:for-each select="PRODUCTDATA/PRODUCT">
  <li><xsl:value-of select="PRODUCTNAME"/></li>
  <li><xsl:value-of select="DESCRIPTION"/></li>
  <li><xsl:value-of select="QUANTITY"/></li>
  <li><xsl:value-of select="PRICE"/></li>
  <br></br>
  </xsl:for-each>
 </body>
 </html>
</xsl:template>
</xsl:stylesheet>
