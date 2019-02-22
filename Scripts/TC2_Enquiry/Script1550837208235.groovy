import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.callTestCase(findTestCase('TC1_Login'), [('username') : 'admin', ('password') : 'admin'], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(25)

WebUI.click(findTestObject('EnquiresObjects/Page_IIHT/a_Add'))

WebUI.setText(findTestObject('Object Repository/EnquiresObjects/Page_IIHT/input__full_name'), 'Simran')

WebUI.setText(findTestObject('Object Repository/EnquiresObjects/Page_IIHT/input_Father Name_father_name'), 'ketanbhai')

WebUI.setText(findTestObject('Object Repository/EnquiresObjects/Page_IIHT/input__email'), 'suchisimran5@gmail.com')

WebUI.setText(findTestObject('Object Repository/EnquiresObjects/Page_IIHT/input__mob_no'), '7909078907')

WebUI.click(findTestObject('Object Repository/EnquiresObjects/Page_IIHT/label_Alt Mob No'))

WebUI.setText(findTestObject('Object Repository/EnquiresObjects/Page_IIHT/input_Alt Mob No_alt_mob_no'), '7862346890')

WebUI.click(findTestObject('Object Repository/EnquiresObjects/Page_IIHT/button_Select Gender'))

WebUI.setText(findTestObject('EnquiresObjects/Page_IIHT/datepicker_object'), '22-04-1992')

WebUI.delay(45)

WebUI.setText(findTestObject('Object Repository/EnquiresObjects/Page_IIHT/textarea_Address_address'), 'surat')

WebUI.scrollToPosition(0, 250)

WebUI.click(findTestObject('Object Repository/EnquiresObjects/Page_IIHT/input_Address_btn btn-primary'))

WebUI.closeBrowser()

