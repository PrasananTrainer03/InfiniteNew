<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
<xsl:template match="/">
<xsl:for-each select="BOOKDETAILS/BOOK">
<li>
TITLE: <xsl:value-of select="TITLE"/><br /> 
AUTHOR: <xsl:value-of select="AFNAME"/> <xsl:text> </xsl:text> <xsl:value-of select="ALNAME"/> <br/>
PRICE: <xsl:value-of select="PRICE" /><br/>
QUANTITY: <xsl:value-of select="QUANTITY" /> <br/>
</li>
<hr />
</xsl:for-each>
</xsl:template>
</xsl:stylesheet>
