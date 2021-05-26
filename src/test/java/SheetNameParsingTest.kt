import com.rsupport.google.GoogleCredentials
import com.rsupport.google.sheet.SheetUrlParser
import org.junit.Assert
import org.junit.Test
import java.io.IOException
import java.security.GeneralSecurityException

class SheetNameParsingTest {

    private val credentialFilePath = "credentials.json"
    private val sheetUrl =
        "https://docs.google.com/spreadsheets/d/1CTLokrhbVB8Th1l09Bv17QOwlQ-L1yvrcQNg6WB9FZ8/edit#gid=1256465417"

    @Test
    fun getSheetNameFromSheetUrl() {
        val credential = GoogleCredentials.createCredentials(credentialFilePath)
        val sheetName = SheetUrlParser(credential, sheetUrl).sheetName
        println("sheetName : $sheetName")
        Assert.assertEquals("android", sheetName)
    }

    @Test
    fun getSpreadSheetIdFromSheetUrl() {
        val credential = GoogleCredentials.createCredentials(credentialFilePath)
        val spreadSheetId = SheetUrlParser(credential, sheetUrl).spreadSheetId
        println("spreadSheetId : $spreadSheetId")
        Assert.assertEquals("1CTLokrhbVB8Th1l09Bv17QOwlQ-L1yvrcQNg6WB9FZ8", spreadSheetId)
    }
}