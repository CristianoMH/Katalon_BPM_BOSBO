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

WebUI.callTestCase(findTestCase('TCs_Luồng cấp mới/TCs_Nhập dữ liệu_Thông tin hồ sơ/TCs_Nhập dữ liệu_Thông tin hồ sơ_Thông tin nguồn thu'), 
    [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Screen_Chi tiết yêu cầu/Screen_Chi tiết yêu cầu_Các action xử lý/tab_Thông tin TSBĐ'))

WebUI.click(findTestObject('Screen_Chi tiết yêu cầu/Screen_Chi tiết yêu cầu_Tab Thông tin TSBĐ/button_Tìm kiếm tài sản'))

WebUI.setText(findTestObject('Screen_Chi tiết yêu cầu/Screen_Chi tiết yêu cầu_Tab Thông tin TSBĐ/textbox_Mã tài sản M-value'), 
    'IDTS.409175')

WebUI.click(findTestObject('Screen_Chi tiết yêu cầu/Screen_Chi tiết yêu cầu_Tab Thông tin TSBĐ/button_Tìm kiếm'))

WebUI.waitForElementNotPresent(findTestObject('Sidebar_Khay/pageLoading_Đang xử lý'), 120)

WebUI.click(findTestObject('Screen_Chi tiết yêu cầu/Screen_Chi tiết yêu cầu_Tab Thông tin TSBĐ/button_Thêm mới tài sản bảo đảm'))

WebUI.click(findTestObject('Screen_Chi tiết yêu cầu/Screen_Chi tiết yêu cầu_Tab Thông tin TSBĐ/droplist_Tài sản_Nhóm tài sản'))

WebUI.click(findTestObject('Screen_Chi tiết yêu cầu/Screen_Chi tiết yêu cầu_Tab Thông tin TSBĐ/droplistItem_Tài sản_Tài sản khác'))

WebUI.click(findTestObject('Screen_Chi tiết yêu cầu/Screen_Chi tiết yêu cầu_Tab Thông tin TSBĐ/droplist_Tài sản_Loại tài sản'))

WebUI.click(findTestObject('Screen_Chi tiết yêu cầu/Screen_Chi tiết yêu cầu_Tab Thông tin TSBĐ/droplistItem_Tài sản_Tài sản khác'))

WebUI.setText(findTestObject('Screen_Chi tiết yêu cầu/Screen_Chi tiết yêu cầu_Tab Thông tin TSBĐ/textbox_Tài sản_Định danh tài sản'), 
    'code123')

WebUI.setText(findTestObject('Screen_Chi tiết yêu cầu/Screen_Chi tiết yêu cầu_Tab Thông tin TSBĐ/textbox_TT giá trị tài sản_Giá trị TSBĐ ghi nhận'), 
    '1000000000')

WebUI.click(findTestObject('Screen_Chi tiết yêu cầu/Screen_Chi tiết yêu cầu_Tab Thông tin TSBĐ/droplist_TT chủ sở hữu_Chủ sở hữu tài sản'))

WebUI.click(findTestObject('Screen_Chi tiết yêu cầu/Screen_Chi tiết yêu cầu_Tab Thông tin TSBĐ/droplistItem_TT chủ sở hữu_Chủ sở hữu tài sản_Khách hàng'))

WebUI.setText(findTestObject('Screen_Chi tiết yêu cầu/Screen_Chi tiết yêu cầu_Tab Thông tin TSBĐ/textbox_TT giá trị tài sản_Giá trị tài sản đã đảm bảo'), 
    '1000000000')

WebUI.setText(findTestObject('Screen_Chi tiết yêu cầu/Screen_Chi tiết yêu cầu_Tab Thông tin TSBĐ/textbox_TT giá trị tài sản_LTV'), 
    '10')

WebUI.setText(findTestObject('Screen_Chi tiết yêu cầu/Screen_Chi tiết yêu cầu_Tab Thông tin TSBĐ/textarea_Thông tin khác_Mô tả tài sản'), 
    'Automation Testing')

WebUI.click(findTestObject('Screen_Chi tiết yêu cầu/Screen_Chi tiết yêu cầu_Các action xử lý/button_Lưu'))

//if (WebUI.verifyElementPresent(findTestObject('Sidebar_Khay/toast_Thông báo'), 10, FailureHandling.OPTIONAL) == true) {
//	WebUI.click(findTestObject('Screen_Chi tiết yêu cầu/Screen_Chi tiết yêu cầu_Tab Thông tin hồ sơ/Screen_Chi tiết yêu cầu_Tab thông tin hồ sơ_Subtab Thông tin KH và NLQ/button_Đóng toast thông báo'))
//}

WebUI.waitForElementNotPresent(findTestObject('Sidebar_Khay/pageLoading_Đang xử lý'), 120)

WebUI.click(findTestObject('Screen_Chi tiết yêu cầu/Screen_Chi tiết yêu cầu_Các action xử lý/button_Thông báo tích xanh_Đóng'))

