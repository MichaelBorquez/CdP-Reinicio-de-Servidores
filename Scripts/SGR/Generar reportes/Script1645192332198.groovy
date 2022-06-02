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
import groovy.time.TimeCategory as TimeCategory
import com.kms.katalon.keyword.excel.ExcelKeywords as ExcelKeywords

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl(GlobalVariable.URL_SGR)

WebUI.setText(findTestObject('Object Repository/Page_Iniciar sesin/input_AutentificacinUnificada_UserName'), '2222222-8')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Iniciar sesin/input_AutentificacinUnificada_Password'), 'r+ipeKXHX4UvOfNToqOjEA==')

WebUI.click(findTestObject('Object Repository/Page_Iniciar sesin/span_Iniciar sesin'))

WebUI.click(findTestObject('Object Repository/Page_- Aguas Nuevas/a_Reportes'))

WebUI.click(findTestObject('Object Repository/Page_- Aguas Nuevas/a_17001'))

WebUI.click(findTestObject('Object Repository/Page_- Aguas Nuevas/input_Fono_sgr'))

WebUI.click(findTestObject('Page_- Aguas Nuevas/input_Victoria_sgr'))

WebUI.click(findTestObject('Page_- Aguas Nuevas/input_Nueva Imperial_sgr'))

T1 = WebUI.getText(findTestObject('Object Repository/Page_- Aguas Nuevas/td_Faenadora Victoria'))

T2 = WebUI.getText(findTestObject('Page_- Aguas Nuevas/td_Frigorfico Imperial'))

T3 = WebUI.getText(findTestObject('Page_- Aguas Nuevas/td_Coca Cola Embonor S.A'))

WebUI.scrollToPosition(0, 15000)

WebUI.click(findTestObject('Object Repository/Page_- Aguas Nuevas/button_Generar Reporte'))

WebUI.scrollToPosition(0, 0)

WebUI.click(findTestObject('Object Repository/Page_- Aguas Nuevas/a_17002'))

WebUI.click(findTestObject('Page_- Aguas Nuevas/input_Fono_sgr2'))

WebUI.click(findTestObject('Page_- Aguas Nuevas/input_Victoria_sgr2'))

WebUI.click(findTestObject('Page_- Aguas Nuevas/input_Nueva Imperial_sgr2'))

T4 = WebUI.getText(findTestObject('Page_- Aguas Nuevas/td_Faenadora Victoria2'))

T5 = WebUI.getText(findTestObject('Page_- Aguas Nuevas/td_Frigorfico Imperial2'))

T6 = WebUI.getText(findTestObject('Page_- Aguas Nuevas/td_Coca Cola Embonor S.A2'))

WebUI.scrollToPosition(0, 15000)

WebUI.click(findTestObject('Page_- Aguas Nuevas/button_Generar Reporte2'))

WebUI.delay(3)

WebUI.closeBrowser()

//obtener variable fecha
use(TimeCategory, { 
        today = new Date()
    })

todayFormat = today.format('dd-MM-yyyy')

//verificar que existe excel descargado
String excelFile01 = ('C:\\Users\\csala\\Downloads\\Procof17001' + todayFormat) + '.csv'

File File01 = new File(excelFile01)

assert File01.exists() == true

String excelFile02 = ('C:\\Users\\csala\\Downloads\\Procof17002' + todayFormat) + '.csv'

File File02 = new File(excelFile02)

assert File02.exists() == true

