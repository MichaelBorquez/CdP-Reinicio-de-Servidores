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
import com.kms.katalon.keyword.excel.ExcelKeywords as ExcelKeywords

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('http://carlo.bernucci:Aguas2021@ohioqa:4322/HomeRequerimiento.aspx')

WebUI.click(findTestObject('Object Repository/Page_Bienvenido Plataforma de Atencin de So_163357/a_Salir'))

WebUI.setText(findTestObject('Object Repository/Page_Bienvenido al Sistema Plataforma de At_4d3f8f/input_Usuario_txtUser'), 
    '2222222-8')

WebUI.click(findTestObject('Object Repository/Page_Bienvenido al Sistema Plataforma de At_4d3f8f/input_Ingrese Usuario_btnLogin'))

WebUI.click(findTestObject('Object Repository/Page_Bienvenido Plataforma de Atencin de So_163357/a_Consulta'))

T1 = WebUI.getText(findTestObject('Object Repository/Page_Bienvenido Plataforma de Atencin de So_163357/td_91730'))

WebUI.click(findTestObject('Object Repository/Page_Bienvenido Plataforma de Atencin de So_163357/div_Exportar'))

WebUI.delay(4)

WebUI.closeBrowser()

String excelFile01 = 'C:\\Users\\csala\\Downloads\\Listado.xlsx'

//verify file are created
File File01 = new File(excelFile01)

assert File01.exists() == true

workbook01 = ExcelKeywords.getWorkbook(excelFile01)

sheet01 = ExcelKeywords.getExcelSheet(workbook01, 'Sheet')

E1 = ExcelKeywords.getCellValueByIndex(sheet01, 1, 0)

WebUI.verifyEqual(T1, E1)

