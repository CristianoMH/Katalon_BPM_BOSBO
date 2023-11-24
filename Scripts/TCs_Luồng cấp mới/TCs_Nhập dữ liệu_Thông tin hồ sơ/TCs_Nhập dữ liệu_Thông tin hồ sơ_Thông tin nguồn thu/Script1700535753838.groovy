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

WebUI.callTestCase(findTestCase('TCs_Luồng cấp mới/TCs_Nhập dữ liệu_Thông tin hồ sơ/TCs_Nhập dữ liệu_Thông tin hồ sơ_Thông tin KH và NLQ'), 
    [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Screen_Chi tiết yêu cầu/Screen_Chi tiết yêu cầu_Các action xử lý/tab_Thông tin hồ sơ_Thông tin nguồn thu'))

Thread.sleep(2000)

WebUI.click(findTestObject('Screen_Chi tiết yêu cầu/Screen_Chi tiết yêu cầu_Tab Thông tin hồ sơ/Screen_Chi tiết yêu cầu_Tab Thông tin hồ sơ_Subtab Thông tin nguồn thu/radiobutton_PP ghi nhận thu nhập_Thực nhận'))

WebUI.click(findTestObject('Screen_Chi tiết yêu cầu/Screen_Chi tiết yêu cầu_Tab Thông tin hồ sơ/Screen_Chi tiết yêu cầu_Tab Thông tin hồ sơ_Subtab Thông tin nguồn thu/droplist_Thực nhận_Loại nguồn thu'))

WebUI.click(findTestObject('Screen_Chi tiết yêu cầu/Screen_Chi tiết yêu cầu_Tab Thông tin hồ sơ/Screen_Chi tiết yêu cầu_Tab Thông tin hồ sơ_Subtab Thông tin nguồn thu/droplistItem_Thực nhận_Loại nguồn thu_Nguồn thu khác'))

WebUI.setText(findTestObject('Screen_Chi tiết yêu cầu/Screen_Chi tiết yêu cầu_Tab Thông tin hồ sơ/Screen_Chi tiết yêu cầu_Tab Thông tin hồ sơ_Subtab Thông tin nguồn thu/textbox_Thực nhận_Thu nhập ghi nhận'), 
    '20000000')

WebUI.click(findTestObject('Screen_Chi tiết yêu cầu/Screen_Chi tiết yêu cầu_Tab Thông tin hồ sơ/Screen_Chi tiết yêu cầu_Tab Thông tin hồ sơ_Subtab Thông tin nguồn thu/droplist_Thực nhận_Chủ nguồn thu'))

WebUI.click(findTestObject('Screen_Chi tiết yêu cầu/Screen_Chi tiết yêu cầu_Tab Thông tin hồ sơ/Screen_Chi tiết yêu cầu_Tab Thông tin hồ sơ_Subtab Thông tin nguồn thu/droplistItem_Thực nhận_Chủ nguồn thu_Khách hàng'))

WebUI.click(findTestObject('Screen_Chi tiết yêu cầu/Screen_Chi tiết yêu cầu_Tab Thông tin hồ sơ/Screen_Chi tiết yêu cầu_Tab Thông tin hồ sơ_Subtab Thông tin nguồn thu/droplist_Thực nhận_Chi tiết NT khác'))

WebUI.click(findTestObject('Screen_Chi tiết yêu cầu/Screen_Chi tiết yêu cầu_Tab Thông tin hồ sơ/Screen_Chi tiết yêu cầu_Tab Thông tin hồ sơ_Subtab Thông tin nguồn thu/droplistItem_Thực nhận_Chi tiết NT khác_Khác'))

WebUI.setText(findTestObject('Screen_Chi tiết yêu cầu/Screen_Chi tiết yêu cầu_Tab Thông tin hồ sơ/Screen_Chi tiết yêu cầu_Tab Thông tin hồ sơ_Subtab Thông tin nguồn thu/textarea_Thực nhận_Thông tin nguồn thu'), 
    'Automation Testing')

WebUI.setText(findTestObject('Screen_Chi tiết yêu cầu/Screen_Chi tiết yêu cầu_Tab Thông tin hồ sơ/Screen_Chi tiết yêu cầu_Tab Thông tin hồ sơ_Subtab Thông tin nguồn thu/textarea_Thực nhận_Diễn giải'), 
    'Automation Testing')

WebUI.click(findTestObject('Screen_Chi tiết yêu cầu/Screen_Chi tiết yêu cầu_Các action xử lý/button_Lưu'))

WebUI.waitForElementNotPresent(findTestObject('Sidebar_Khay/pageLoading_Đang xử lý'), 120)

WebUI.click(findTestObject('Screen_Chi tiết yêu cầu/Screen_Chi tiết yêu cầu_Tab Thông tin hồ sơ/Screen_Chi tiết yêu cầu_Tab Thông tin hồ sơ_Subtab Thông tin nguồn thu/button_Thông báo tích xanh_Đóng'))

