import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
//importar
import org.apache.pdfbox.pdmodel.PDDocument
import org.apache.pdfbox.text.PDFTextStripper
import java.io.File
import com.kms.katalon.core.logging.KeywordLogger


WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://adfs-sso2.aguasnuevas.cl/adfs/ls?wa=wsignin1.0&wtrealm=https%3a%2f%2fsgrqa.aguasnuevas.cl&wctx=rm%3d0%26id%3dpassive%26ru%3d%252f&wct=2022-03-30T01%3a57%3a05Z&wreply=https%3a%2f%2fsgrqa.aguasnuevas.cl%2fAccount%2fLogin')

WebUI.setText(findTestObject('Object Repository/Page_Iniciar sesin/input_AutentificacinUnificada_UserName'), '2222222-8')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Iniciar sesin/input_AutentificacinUnificada_Password'), 'r+ipeKXHX4UvOfNToqOjEA==')

WebUI.click(findTestObject('Object Repository/Page_Iniciar sesin/span_Iniciar sesin'))

WebUI.click(findTestObject('Object Repository/Page_- Aguas Nuevas/a_Clientes'))

WebUI.click(findTestObject('Object Repository/Page_Clientes - Aguas Nuevas/a_Maria Anglica Vasquez_btn btn-default'))

WebUI.click(findTestObject('Object Repository/Page_Ver Cliente RIL - Aguas Nuevas/a_Generar PDF'))

WebUI.delay(5)

WebUI.closeBrowser()

PDDocument doc = new PDDocument().load(new File('C:\\Users\\csala\\Downloads\\Detalle Cliente - 29-03-22.pdf'))

PDFTextStripper stripper = new PDFTextStripper()
String pdfFileInText = stripper.getText(doc)

int index = pdfFileInText.indexOf("Document")
doc.close()
KeywordLogger logger = new KeywordLogger()
if(index>0)
{
	logger.logPassed("Found the word")
}
else
{
	logger.logFailed("Did not find the word")
	
}




