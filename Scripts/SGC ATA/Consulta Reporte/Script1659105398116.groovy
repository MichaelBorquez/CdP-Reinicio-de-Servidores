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
import com.kms.katalon.core.configuration.RunConfiguration as RC
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory

if (RC.getExecutionProfile() == 'QA') {
	WebUI.callTestCase(findTestCase('SGC ATA/Login QA'), [:], FailureHandling.STOP_ON_FAILURE)
} else {
	if (RC.getExecutionProfile() == 'Productivo') {
		WebUI.callTestCase(findTestCase('SGC ATA/LoginProductivo'), [:], FailureHandling.STOP_ON_FAILURE)
	} else {
		assert false
	}
}

WebUI.delay(2)

WebUI.navigateToUrl('https://sgcata.aguasnuevas.cl/PRO_ParamRptListadoSobreconsumo.aspx')

WebUI.click(findTestObject('Object Repository/Page_Parmetros Para Listado De Servicios Co_c1535a/img_Ciclo_xddlCiclo_B-1Img'))

WebUI.click(findTestObject('Object Repository/Page_Parmetros Para Listado De Servicios Co_c1535a/td_Cicl0 285- (202205)'))

WebUI.click(findTestObject('Object Repository/Page_Parmetros Para Listado De Servicios Co_c1535a/div_Ver'))

WebUI.switchToWindowTitle('Reporte')

T1 = WebUI.getText(findTestObject('Object Repository/Page_Listado de servicios con sobreconsumo123/td_ANAISABELPUGACONTRERAS'))

WebUI.closeBrowser()

if (T1.length() == 0) {
	assert false
}

