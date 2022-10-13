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
	WebUI.callTestCase(findTestCase('Prueba SGC/LoginSispec'), [:], FailureHandling.STOP_ON_FAILURE)
} else {
	assert false	
}

WebUI.click(findTestObject('Object Repository/Page_Bienvenido al Sistema Plataformas de E_5fac86/div_Administracin'))

WebUI.click(findTestObject('Object Repository/Page_Bienvenido al Sistema Plataformas de E_5fac86/td_Parmetros del Sistema'))

WebUI.click(findTestObject('Object Repository/Page_Bienvenido al Sistema Plataformas de E_5fac86/td_Usuarios'))

WebUI.click(findTestObject('Object Repository/Page_Listar Usuarios/nobr_Alarcon'))

