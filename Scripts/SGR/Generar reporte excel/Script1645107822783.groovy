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

WebUI.click(findTestObject('Object Repository/Page_- Aguas Nuevas/strong_2222222'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_- Aguas Nuevas/select_Aguas Araucania S.A.Aguas Altiplano _14e2a8'), 
    '9', true)

WebUI.click(findTestObject('Object Repository/Page_- Aguas Nuevas/a_Gestin'))

WebUI.click(findTestObject('Object Repository/Page_- Aguas Nuevas/a_Gestin Prestaciones'))

WebUI.scrollToPosition(0, 200)

WebUI.click(findTestObject('Object Repository/Page_Gestin Prestaciones - Aguas Nuevas/a_Generar Reporte'))

WebUI.delay(15)

WebUI.scrollToPosition(0, 0)

T1 = WebUI.getText(findTestObject('Object Repository/Page_Gestin Prestaciones - Aguas Nuevas/th_Establecimiento'))

T2 = WebUI.getText(findTestObject('Object Repository/Page_Gestin Prestaciones - Aguas Nuevas/th_Fecha Muestreo'))

T3 = WebUI.getText(findTestObject('Object Repository/Page_Gestin Prestaciones - Aguas Nuevas/th_Laboratorio'))

WebUI.closeBrowser()

//obtener variable fecha
use(TimeCategory, { 
        today = new Date()
    })

todayFormat = today.format('dd-MM-yyyy')

//verificar que existe excel descargado
String excelFile01 = ('C:\\Users\\csala\\Downloads\\Controles ' + todayFormat) + '.xlsx'

File File01 = new File(excelFile01)

assert File01.exists() == true

workbook01 = ExcelKeywords.getWorkbook(excelFile01)

sheet01 = ExcelKeywords.getExcelSheet(workbook01, 'Controles ' + todayFormat)

E1 = ExcelKeywords.getCellValueByIndex(sheet01, 0, 3)

E2 = ExcelKeywords.getCellValueByIndex(sheet01, 0, 4)

E3 = ExcelKeywords.getCellValueByIndex(sheet01, 0, 5)

WebUI.verifyEqual(T1, E1)

WebUI.verifyEqual(T2, E2)

WebUI.verifyEqual(T3, E3)

