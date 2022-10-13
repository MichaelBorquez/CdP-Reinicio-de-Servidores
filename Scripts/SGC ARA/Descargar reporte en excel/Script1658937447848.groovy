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
//importar
import com.kms.katalon.core.configuration.RunConfiguration as RC
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory

if (RC.getExecutionProfile() == 'QA') {
	WebUI.callTestCase(findTestCase('SGC ARA/Login QA'), [:], FailureHandling.STOP_ON_FAILURE)
} else {
	if (RC.getExecutionProfile() == 'Productivo') {
		WebUI.callTestCase(findTestCase('SGC ARA/LoginProductivo'), [:], FailureHandling.STOP_ON_FAILURE)
	} else {
		assert false
	}
}

WebUI.delay(2)


WebUI.navigateToUrl('https://sgcara.aguasnuevas.cl/PRO_ParamRptListadoSobreconsumo.aspx')

WebUI.click(findTestObject('Object Repository/Page_Parmetros Para Listado De Servicios Co_c1535a/img_Ciclo_xddlCiclo_B-1Img'))

WebUI.click(findTestObject('Page_Parmetros Para Listado De Servicios Co_c1535a/td_Ciclo 291- (201802)'))

WebUI.click(findTestObject('Object Repository/Page_Parmetros Para Listado De Servicios Co_c1535a/div_Ver'))

WebUI.switchToWindowTitle('Reporte')

WebUI.click(findTestObject('Object Repository/Page_Reporte/img_Cargando_xdocView_Splitter_Toolbar_Menu_8b5a71'))

WebUI.delay(3)

WebUI.closeBrowser()

String excelFile01 = GlobalVariable.Ruta_Descargas+'Informe.csv'

File File01 = new File(excelFile01)

assert File01.exists() == true

