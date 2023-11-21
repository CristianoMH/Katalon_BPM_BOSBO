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

WebUI.navigateToUrl('https://digilending-sit.msb.com.vn/v2/')

WebUI.setText(findTestObject('Object Repository/Page_Sign in to msb/input_username'), 'maidt11_rm')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Sign in to msb/input_password'), 'HeCM15nHKBI=')

WebUI.click(findTestObject('Object Repository/Page_Sign in to msb/button_ng nhp'))

WebUI.click(findTestObject('Object Repository/Page_Digi-Lending/app-sidebar-nav-link-content_Yu cu cn x l'))

WebUI.click(findTestObject('Object Repository/Page_Digi-Lending/span_To yu cu'))

WebUI.setText(findTestObject('Object Repository/Page_Digi-Lending/input_w-100 form-control ng-untouched ng-pr_67d64b'), 
    '1111')

WebUI.click(findTestObject('Object Repository/Page_Digi-Lending/button_btn btn-primary'))

WebUI.click(findTestObject('Object Repository/Page_Digi-Lending/div_ang x l'))

WebUI.click(findTestObject('Object Repository/Page_Digi-Lending/button_To h s'))

WebUI.click(findTestObject('Object Repository/Page_Digi-Lending/button_To mi'))

WebUI.click(findTestObject('Object Repository/Page_Digi-Lending/span_Thng tin khi to'))

WebUI.click(findTestObject('Object Repository/Page_Digi-Lending/span_Chn lung'))

WebUI.click(findTestObject('Object Repository/Page_Digi-Lending/div_Lung ph duyt ti HO'))

WebUI.click(findTestObject('Object Repository/Page_Digi-Lending/span_Chn lung'))

WebUI.click(findTestObject('Object Repository/Page_Digi-Lending/div_Lung thng'))

WebUI.click(findTestObject('Object Repository/Page_Digi-Lending/span_Chn phn khc khch hng'))

WebUI.click(findTestObject('Object Repository/Page_Digi-Lending/div_HP'))

WebUI.click(findTestObject('Object Repository/Page_Digi-Lending/inputformly_12_input_partnerCode_8'))

WebUI.click(findTestObject('Object Repository/Page_Digi-Lending/bpm-formly-group_Lung ph duyt  Lung ph duyt_01b371'))

WebUI.click(findTestObject('Object Repository/Page_Digi-Lending/span_HP'))

WebUI.click(findTestObject('Object Repository/Page_Digi-Lending/div_YP'))

WebUI.click(findTestObject('Object Repository/Page_Digi-Lending/bpm-formly-field_Phn khc khch hngYP'))

WebUI.click(findTestObject('Object Repository/Page_Digi-Lending/span_YP'))

WebUI.click(findTestObject('Object Repository/Page_Digi-Lending/div_Khc'))

WebUI.click(findTestObject('Object Repository/Page_Digi-Lending/span_Khc'))

WebUI.click(findTestObject('Object Repository/Page_Digi-Lending/label_col-md-5 col-xl-4 label-formly text-r_20969e'))

WebUI.click(findTestObject('Object Repository/Page_Digi-Lending/span_Thng tin KH  NLQ'))

WebUI.click(findTestObject('Object Repository/Page_Digi-Lending/span_Trnh  hc vn'))

WebUI.click(findTestObject('Object Repository/Page_Digi-Lending/div_Trn i hc'))

WebUI.click(findTestObject('Object Repository/Page_Digi-Lending/span_Chn thnh ph'))

WebUI.click(findTestObject('Object Repository/Page_Digi-Lending/li_Tnh Vnh Phc'))

WebUI.click(findTestObject('Object Repository/Page_Digi-Lending/span_Chn qun huyn'))

WebUI.click(findTestObject('Object Repository/Page_Digi-Lending/li_Thnh ph Vnh Yn'))

WebUI.click(findTestObject('Object Repository/Page_Digi-Lending/span_Chn phng x'))

WebUI.click(findTestObject('Object Repository/Page_Digi-Lending/li_X Thanh Tr'))

WebUI.setText(findTestObject('Object Repository/Page_Digi-Lending/input_addressLine'), '136 Hồ Tùng Mậu')

WebUI.click(findTestObject('Object Repository/Page_Digi-Lending/i_icon-msb-save-fill fs-i my-0'))

WebUI.click(findTestObject('Object Repository/Page_Digi-Lending/button_Lu'))

WebUI.click(findTestObject('Object Repository/Page_Digi-Lending/span_Chn quan h'))

WebUI.click(findTestObject('Object Repository/Page_Digi-Lending/div_Ngi hn phi khng bo lnh tr n'))

WebUI.setText(findTestObject('Object Repository/Page_Digi-Lending/inputformly_31_input_fullName_1'), 'Hoàng Văn Minh')

WebUI.setText(findTestObject('Object Repository/Page_Digi-Lending/inputformly_31_input_phoneNumber_2'), '0384110266')

WebUI.click(findTestObject('Object Repository/Page_Digi-Lending/span_Chn quan h'))

WebUI.click(findTestObject('Object Repository/Page_Digi-Lending/div_Ngi hn phi khng bo lnh tr n'))

WebUI.setText(findTestObject('Object Repository/Page_Digi-Lending/inputformly_35_input_fullName_1'), 'Phạm Thùy Linh')

WebUI.setText(findTestObject('Object Repository/Page_Digi-Lending/inputformly_35_input_phoneNumber_2'), '038438123')

WebUI.click(findTestObject('Object Repository/Page_Digi-Lending/button_Tra cu CIC'))

WebUI.click(findTestObject('Object Repository/Page_Digi-Lending/td_text-center'))

WebUI.click(findTestObject('Object Repository/Page_Digi-Lending/div_p-checkbox-box'))

WebUI.click(findTestObject('Object Repository/Page_Digi-Lending/button_Tra cu'))

WebUI.click(findTestObject('Object Repository/Page_Digi-Lending/button_ng'))

WebUI.click(findTestObject('Object Repository/Page_Digi-Lending/span_p-dialog-header-close-icon pi pi-times_43e136'))

WebUI.click(findTestObject('Object Repository/Page_Digi-Lending/a_Thng tin ngun thu'))

WebUI.click(findTestObject('Object Repository/Page_Digi-Lending/button_Lu'))

WebUI.click(findTestObject('Object Repository/Page_Digi-Lending/div_p-radiobutton-box'))

WebUI.click(findTestObject('Object Repository/Page_Digi-Lending/div_Thc nhnQuy iM NT  -'))

WebUI.click(findTestObject('Object Repository/Page_Digi-Lending/div_p-radiobutton-box_1'))

WebUI.click(findTestObject('Object Repository/Page_Digi-Lending/div_empty'))

WebUI.click(findTestObject('Object Repository/Page_Digi-Lending/div_Cho thukhai thc ti sn'))

WebUI.click(findTestObject('Object Repository/Page_Digi-Lending/input_p-inputnumber-input p-inputtext p-component'))

WebUI.click(findTestObject('Object Repository/Page_Digi-Lending/span_Chn loi ti sn'))

WebUI.click(findTestObject('Object Repository/Page_Digi-Lending/div_Bt ng sn'))

WebUI.click(findTestObject('Object Repository/Page_Digi-Lending/span_Chn ch ngun thu'))

WebUI.click(findTestObject('Object Repository/Page_Digi-Lending/span_Ngi hn phi khng bo lnh tr n'))

WebUI.click(findTestObject('Object Repository/Page_Digi-Lending/span_Chn mc ch'))

WebUI.click(findTestObject('Object Repository/Page_Digi-Lending/div_Thu'))

WebUI.setText(findTestObject('Object Repository/Page_Digi-Lending/textareaformly_304_inputtextareaautoresize__69b6a7'), 
    'test')

WebUI.setText(findTestObject('Object Repository/Page_Digi-Lending/input_p-inputnumber-input p-inputtext p-component'), '')

WebUI.click(findTestObject('Object Repository/Page_Digi-Lending/input_p-inputnumber-input p-inputtext p-component'))

WebUI.click(findTestObject('Object Repository/Page_Digi-Lending/div_Phng php ghi nhn thu nhpThc nhnQuy iM N_43f017'))

WebUI.click(findTestObject('Object Repository/Page_Digi-Lending/i_icon-msb-save-fill text-disable'))

WebUI.click(findTestObject('Object Repository/Page_Digi-Lending/button_Thng tin TSB'))

WebUI.click(findTestObject('Object Repository/Page_Digi-Lending/button_Thng tin h s'))

WebUI.click(findTestObject('Object Repository/Page_Digi-Lending/a_Thng tin KH  NLQ'))

WebUI.click(findTestObject('Object Repository/Page_Digi-Lending/span_Thng tin ngun thu'))

WebUI.click(findTestObject('Object Repository/Page_Digi-Lending/a_Thng tin khi to'))

WebUI.click(findTestObject('Object Repository/Page_Digi-Lending/a_Thng tin KH  NLQ'))

WebUI.click(findTestObject('Object Repository/Page_Digi-Lending/button_Tra cu CIC'))

WebUI.click(findTestObject('Object Repository/Page_Digi-Lending/div_p-checkbox-box_1'))

WebUI.click(findTestObject('Object Repository/Page_Digi-Lending/div_p-checkbox-box_1_2'))

WebUI.click(findTestObject('Object Repository/Page_Digi-Lending/button_Tra cu'))

WebUI.click(findTestObject('Object Repository/Page_Digi-Lending/button_ng'))

WebUI.click(findTestObject('Object Repository/Page_Digi-Lending/span_p-dialog-header-close-icon pi pi-times_7a29d4'))

WebUI.click(findTestObject('Object Repository/Page_Digi-Lending/button_Thng tin TSB'))

WebUI.click(findTestObject('Object Repository/Page_Digi-Lending/button_Thng tin thc a'))

WebUI.click(findTestObject('Object Repository/Page_Digi-Lending/button_Thng tin khon vay'))

WebUI.click(findTestObject('Object Repository/Page_Digi-Lending/button_Danh mc h s'))

WebUI.click(findTestObject('Object Repository/Page_Digi-Lending/button_Thng tin h s'))

