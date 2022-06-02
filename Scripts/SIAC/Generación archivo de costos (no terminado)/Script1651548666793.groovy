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
import groovy.time.TimeCategory as TimeCategory

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl(GlobalVariable.URL_SIAC)

WebUI.setText(findTestObject('Object Repository/Page_Iniciar sesin/input_AutentificacinUnificada_UserName'), '2222222-8')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Iniciar sesin/input_AutentificacinUnificada_Password'), 'r+ipeKXHX4UvOfNToqOjEA==')

WebUI.click(findTestObject('Object Repository/Page_Iniciar sesin/span_Iniciar sesin'))

WebUI.click(findTestObject('Object Repository/Page_Inicio  Sistema de Activacin de Bienes (SIAC)/div_Consultas'))

WebUI.click(findTestObject('Object Repository/Page_Inicio  Sistema de Activacin de Bienes (SIAC)/li_Costo'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Consultas Costos  Sistema de Activacin_7e5c7e/select_AltiplanoAraucanaMagallanesNueva Ata_844753'), 
    '12', false)

WebUI.click(findTestObject('Page_Consultas Costos  Sistema de Activacin de Bienes (SIAC)/input_Estados_ctl00ContentPlaceHolder1chbEstados0 1'))

WebUI.click(findTestObject('Page_Consultas Costos  Sistema de Activacin de Bienes (SIAC)/input_Activado Siac_ctl00ContentPlaceHolder1chbEstados1 2'))

WebUI.click(findTestObject('Page_Consultas Costos  Sistema de Activacin de Bienes (SIAC)/input_Castigado_ctl00ContentPlaceHolder1chbEstados3 3'))

WebUI.click(findTestObject('Page_Consultas Costos  Sistema de Activacin de Bienes (SIAC)/input_En Administracin_ctl00ContentPlaceHolder1chbEstados4 4'))

WebUI.click(findTestObject('Page_Consultas Costos  Sistema de Activacin de Bienes (SIAC)/input_En Espera De Regularizacin_ctl00ContentPlaceHolder1chbEstados5 5'))

WebUI.click(findTestObject('Page_Consultas Costos  Sistema de Activacin de Bienes (SIAC)/input_En Proceso De Activacin_ctl00ContentPlaceHolder1chbEstados6 6'))

WebUI.click(findTestObject('Page_Consultas Costos  Sistema de Activacin de Bienes (SIAC)/input_Nulo_ctl00ContentPlaceHolder1chbEstados8 7'))

WebUI.click(findTestObject('Page_Consultas Costos  Sistema de Activacin de Bienes (SIAC)/input_Pendiente De Activacin_ctl00ContentPlaceHolder1chbEstados9 8'))

WebUI.click(findTestObject('Page_Consultas Costos  Sistema de Activacin de Bienes (SIAC)/input_Incluye Ref_ctl00ContentPlaceHolder1btnDescargar'))

WebUI.delay(5)

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

