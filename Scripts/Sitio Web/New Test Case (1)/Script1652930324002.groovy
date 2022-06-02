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

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://www.aguasaraucania.cl/index')

WebUI.setText(findTestObject('Object Repository/Page_Aguas Araucana/input_PAGA AQU_rut'), '15.249.142-5')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Aguas Araucana/input_PAGA AQU_pass'), 'aeHFOx8jV/A=')

WebUI.click(findTestObject('Object Repository/Page_Aguas Araucana/input_PAGA AQU_enviarMovil'))

WebUI.click(findTestObject('Object Repository/Page_Ficha comercial/a_Mis boletas'))

T1 = WebUI.getText(findTestObject('Object Repository/Page_Mis boletas/td_Mayo 2022'))

println(T1)

