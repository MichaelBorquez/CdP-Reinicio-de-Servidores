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
import org.apache.commons.io.FileUtils as FileUtils
//importar
import com.kms.katalon.core.configuration.RunConfiguration as RC
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory

if (RC.getExecutionProfile() == 'QA') {
	WebUI.callTestCase(findTestCase('SGC AMA/Login QA'), [:], FailureHandling.STOP_ON_FAILURE)
} else {
	if (RC.getExecutionProfile() == 'Productivo') {
		WebUI.callTestCase(findTestCase('SGC AMA/LoginProductivo'), [:], FailureHandling.STOP_ON_FAILURE)
	} else {
		assert false
	}
}

WebUI.delay(2)

WebUI.navigateToUrl('https://sgcama.aguasnuevas.cl/PRO_ParamGenerarDTE.aspx')

WebUI.click(findTestObject('Object Repository/Page_Generacin DTE/img_Ciclo_xrpnlLote_xddlCiclo_B-1Img'))

WebUI.click(findTestObject('Object Repository/Page_Generacin DTE/td_Ciclo 345- (202208)'))

WebUI.click(findTestObject('Object Repository/Page_Generacin DTE/td_Desde_dxic'))

WebUI.setText(findTestObject('Object Repository/Page_Generacin DTE/input_Hasta_ASPxRoundPanel2xtxtNoDocumentoHasta'), '5749065')

WebUI.click(findTestObject('Object Repository/Page_Generacin DTE/div_Generar'))

WebUI.click(findTestObject('Object Repository/Page_Ejecucin de Proceso/div_Ejecutar'))

WebUI.acceptAlert()

WebUI.delay(10)

WebUI.click(findTestObject('Object Repository/Page_Ejecucin de Proceso/div_Guardar DTE'))

WebUI.delay(5)

WebUI.closeBrowser()

//obtener variable fecha
use(TimeCategory, { 
        today = new Date()
    })

todayFormat = today.format('yyyy-MM')

File file = new File((GlobalVariable.Ruta_Descargas+'AM-' + todayFormat) + '-01-39.txt')

String text = FileUtils.readFileToString(file)

println(text)

if (text.contains('Aguas') == false) {
    assert false
}

