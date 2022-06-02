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

WebUI.navigateToUrl('https://adfs-sso2.aguasnuevas.cl/adfs/ls?wa=wsignin1.0&wtrealm=https%3a%2f%2fpsaqa.aguasnuevas.cl&wctx=rm%3d0%26id%3dpassive%26ru%3d%252fLogin.aspx&wct=2022-04-29T02%3a33%3a00Z&wreply=https%3a%2f%2fpsaqa.aguasnuevas.cl%2fDefault.aspx')

WebUI.setText(findTestObject('Object Repository/Page_Iniciar sesin/input_AutentificacinUnificada_UserName'), '2222222-8')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Iniciar sesin/input_AutentificacinUnificada_Password'), 'r+ipeKXHX4UvOfNToqOjEA==')

WebUI.click(findTestObject('Object Repository/Page_Iniciar sesin/span_Iniciar sesin'))

WebUI.click(findTestObject('Object Repository/Page_Inicio/div_Atenciones'))

WebUI.click(findTestObject('Object Repository/Page_Inicio/li_Asignacin'))

WebUI.click(findTestObject('Object Repository/Page_Asignar/img'))

WebUI.verifyElementNotVisibleInViewport(findTestObject('Page_Asignar/span_No se puede encontrar una parte de la _42178b'), 
    0)

WebUI.click(findTestObject('Object Repository/Page_Asignar/span_Asignar'))

WebUI.verifyElementNotVisibleInViewport(findTestObject('Page_Asignar/span_No se puede encontrar una parte de la _42178b'), 
    0)

WebUI.click(findTestObject('Object Repository/Page_Asignar/span_Derivar'))

WebUI.verifyElementNotPresent(findTestObject('Page_Asignar/span_No se puede encontrar una parte de la _42178b_1'), 0)

WebUI.closeBrowser()

