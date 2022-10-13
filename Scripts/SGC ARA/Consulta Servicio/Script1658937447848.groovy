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
	WebUI.callTestCase(findTestCase('SGC ARA/Login QA'), [:], FailureHandling.STOP_ON_FAILURE)
} else {
	if (RC.getExecutionProfile() == 'Productivo') {
		WebUI.callTestCase(findTestCase('SGC ARA/LoginProductivo'), [:], FailureHandling.STOP_ON_FAILURE)
	} else {
		assert false
	}
}

WebUI.click(findTestObject('Object Repository/Page_Atencin de Clientes  Sistema SGC/div_Consulta'))

WebUI.click(findTestObject('Object Repository/Page_Atencin de Clientes  Sistema SGC/li_Nueva'))

WebUI.switchToWindowTitle('Nueva consulta')

WebUI.setText(findTestObject('Object Repository/Page_Nueva consulta/input_N Servicio_xtxtIdServicio'), '700000')

WebUI.click(findTestObject('Object Repository/Page_Nueva consulta/img_-_xbtnBuscarClienteImg'))

T1 = WebUI.getText(findTestObject('Object Repository/Page_Nueva consulta/input_Nombres_ASPxRoundPanel1xtxtCliente'))

T2 = WebUI.getText(findTestObject('Object Repository/Page_Nueva consulta/input_Direccin_ASPxRoundPanel1xtxtDirecion'))

WebUI.click(findTestObject('Object Repository/Page_Nueva consulta/div_Aceptar'))

WebUI.switchToWindowTitle('Atención de Clientes | Sistema SGC')

T3 = WebUI.getText(findTestObject('Object Repository/Page_Atencin de Clientes  Sistema SGC/input_-_BarraHerramientaClientextxtBHCCliente'))

T4 = WebUI.getText(findTestObject('Object Repository/Page_Atencin de Clientes  Sistema SGC/input_Direccin_xtxtDireccion'))

WebUI.verifyEqual(T1,T3)

WebUI.verifyEqual(T2,T4)

WebUI.closeBrowser()

