<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
<xsl:template match="/">
<html><body>
<table border="2" bgcolor="pink">
<tr>
<th>Product Name</th>
<th>Description</th>
<th>Quantity</th>
<th>Price</th>
</tr>
<xsl:for-each select="PRODUCTDATA/PRODUCT">
<tr>
<td><xsl:value-of select="PRODUCTNAME"/></td>
<td><xsl:value-of select="DESCRIPTION"/></td>
<td><xsl:value-of select="QUANTITY"/></td>
<td><xsl:value-of select="PRICE"/></td>
</tr>
</xsl:for-each>
</table>
</body>
</html>
</xsl:template>
</xsl:stylesheet>
