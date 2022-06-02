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
import java.io.File as File

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://adfs-sso2.aguasnuevas.cl/adfs/ls?wa=wsignin1.0&wtrealm=https%3a%2f%2fsgrqa.aguasnuevas.cl&wctx=rm%3d0%26id%3dpassive%26ru%3d%252f&wct=2022-02-17T16%3a37%3a49Z&wreply=https%3a%2f%2fsgrqa.aguasnuevas.cl%2fAccount%2fLogin')

WebUI.setText(findTestObject('Object Repository/Page_Iniciar sesin/input_AutentificacinUnificada_UserName'), '2222222-8')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Iniciar sesin/input_AutentificacinUnificada_Password'), 'r+ipeKXHX4UvOfNToqOjEA==')

WebUI.click(findTestObject('Object Repository/Page_Iniciar sesin/span_Iniciar sesin'))

WebUI.click(findTestObject('Object Repository/Page_- Aguas Nuevas/a_Gestin'))

WebUI.click(findTestObject('Object Repository/Page_- Aguas Nuevas/a_Gestin Prestaciones'))

WebUI.click(findTestObject('Object Repository/Page_Gestin Prestaciones - Aguas Nuevas/a_Controles Histricos'))

WebUI.click(findTestObject('Object Repository/Page_Gestin Prestaciones - Aguas Nuevas/input_Buscar_toggle'))

WebUI.scrollToPosition(0, 500)

WebUI.click(findTestObject('Object Repository/Page_Gestin Prestaciones - Aguas Nuevas/button_Generar ZIP Informes'))

WebUI.delay(75)

String zipFile = ('C:\\Users\\csala\\Downloads\\informes.zip')

File File01 = new File(zipFile)

assert zipFile.exists() == true


public boolean isFileDownloaded(String downloadPath, String informes) {
	File dir = new File(downloadPath);
	File[] dirContents = dir.listFiles();
  
	for (int i = 0; i < dirContents.length; i++) {
		if (dirContents[i].getName().equals(informes)) {
			// File has been found, it can now be deleted:
			dirContents[i].delete();
			return true;
		}
			}
		return false;
	}
