<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
<xsl:template match="/">
<xsl:for-each select="BOOKDETAILS/BOOK">
<xsl:sort select="PRICE" />
<xsl:sort select="@BOOKID" />
<LI>
		<xsl:value-of select="@BOOKID"/>
	<xsl:value-of select="TITLE"/>
	<xsl:value-of select="PRICE"/>
</LI>
</xsl:for-each>
</xsl:template>
</xsl:stylesheet>
