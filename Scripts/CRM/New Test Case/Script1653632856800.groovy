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

WebUI.navigateToUrl('https://sts.aguasnuevas.cl/adfs/ls/?wa=wsignin1.0&wtrealm=https%3a%2f%2fcrm.aguasnuevas.cl%2f&wctx=rm%3d1%26id%3dccd0a3a1-24ec-43ab-bc7f-1fbe0bdff78a%26ru%3dhttps%253a%252f%252fcrm.aguasnuevas.cl%252fdefault.aspx%26crmorgid%3dfdd877d0-7bde-e611-80d7-0050569b085b&wct=2022-05-27T06%3a27%3a46Z&wauth=urn%3aoasis%3anames%3atc%3aSAML%3a1.0%3aam%3apassword')

WebUI.setText(findTestObject('Object Repository/Page_Iniciar sesin/input_Inicie sesin mediante su cuenta organ_a45617'), 
    'aguas\\gonzalo figueroa')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Iniciar sesin/input_Inicie sesin mediante su cuenta organ_874196'), 
    'YaNI/ikGLCIEdUBvObImAg==')

WebUI.click(findTestObject('Object Repository/Page_Iniciar sesin/span_Iniciar sesin'))

WebUI.click(findTestObject('Page_rdenes de Trabajo Todas las Ordenes de Trabajos ltimos 6 meses - Microsoft Dynamics 365/td_Cerrar Ventana Emergente'))

WebUI.click(findTestObject('Object Repository/Page_rdenes de Trabajo Todas las Ordenes de_4e407a/span_Servicio_navTabButtonArrowDown'))

WebUI.click(findTestObject('Object Repository/Page_rdenes de Trabajo Todas las Ordenes de_4e407a/a_Requerimientos'))

WebUI.doubleClick(findTestObject('Object Repository/Page_Requerimientos Historial atenciones - _ba5a0d/td_Creado_ms-crm-List-DataCell inner-grid-c_94bbbc_1'))

WebUI.verifyElementText(findTestObject('Page_Requerimiento CAS-2636747-L6W9Y7/td_Datos Generales del Requerimiento'), 'Datos Generales del Requerimiento')

