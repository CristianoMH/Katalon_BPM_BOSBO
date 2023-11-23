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

WebUI.callTestCase(findTestCase('TCs_Luồng cấp mới/TCs_Nhập dữ liệu_Thông tin hồ sơ/TCs_Nhập dữ liệu_Thông tin hồ sơ_Thông tin khởi tạo'), 
    [('MaDoiTac_Valid') : '000123'], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Screen_Chi tiết yêu cầu/Screen_Chi tiết yêu cầu_Các action xử lý/tab_Thông tin hồ sơ_Thông tin KH và NLQ'))

WebUI.click(findTestObject('Screen_Chi tiết yêu cầu/Screen_Chi tiết yêu cầu_Tab Thông tin hồ sơ/Screen_Chi tiết yêu cầu_Tab thông tin hồ sơ_Subtab Thông tin KH và NLQ/droplist_TT pháp lý KH_Trình độ học vấn'))

WebUI.click(findTestObject('Screen_Chi tiết yêu cầu/Screen_Chi tiết yêu cầu_Tab Thông tin hồ sơ/Screen_Chi tiết yêu cầu_Tab thông tin hồ sơ_Subtab Thông tin KH và NLQ/droplistItem_TT pháp lý KH_Đại học'))

WebUI.scrollToElement(findTestObject('Screen_Chi tiết yêu cầu/Screen_Chi tiết yêu cầu_Tab Thông tin hồ sơ/Screen_Chi tiết yêu cầu_Tab thông tin hồ sơ_Subtab Thông tin KH và NLQ/table_TT pháp lý khách hàng_TT địa chỉ'), 
    120)

Thread.sleep(2000)

WebUI.click(findTestObject('Screen_Chi tiết yêu cầu/Screen_Chi tiết yêu cầu_Tab Thông tin hồ sơ/Screen_Chi tiết yêu cầu_Tab thông tin hồ sơ_Subtab Thông tin KH và NLQ/droplist_TT pháp lý KH_TT địa chỉ 2_Tỉnh hoặc Thành phố'))

WebUI.click(findTestObject('Screen_Chi tiết yêu cầu/Screen_Chi tiết yêu cầu_Tab Thông tin hồ sơ/Screen_Chi tiết yêu cầu_Tab thông tin hồ sơ_Subtab Thông tin KH và NLQ/droplistItem_TT pháp lý KH_TT địa chỉ_TP HN'))

WebUI.click(findTestObject('Screen_Chi tiết yêu cầu/Screen_Chi tiết yêu cầu_Tab Thông tin hồ sơ/Screen_Chi tiết yêu cầu_Tab thông tin hồ sơ_Subtab Thông tin KH và NLQ/droplist_TT pháp lý KH_TT địa chỉ 2_Quận hoặc Huyện'))

WebUI.click(findTestObject('Screen_Chi tiết yêu cầu/Screen_Chi tiết yêu cầu_Tab Thông tin hồ sơ/Screen_Chi tiết yêu cầu_Tab thông tin hồ sơ_Subtab Thông tin KH và NLQ/droplistItem_TT pháp lý KH_TT địa chỉ_Quận Bắc Từ Liêm'))

WebUI.click(findTestObject('Screen_Chi tiết yêu cầu/Screen_Chi tiết yêu cầu_Tab Thông tin hồ sơ/Screen_Chi tiết yêu cầu_Tab thông tin hồ sơ_Subtab Thông tin KH và NLQ/droplist_TT pháp lý KH_TT địa chỉ 2_Phường hoặc Xã'))

WebUI.click(findTestObject('Screen_Chi tiết yêu cầu/Screen_Chi tiết yêu cầu_Tab Thông tin hồ sơ/Screen_Chi tiết yêu cầu_Tab thông tin hồ sơ_Subtab Thông tin KH và NLQ/droplistItem_TT pháp lý KH_TT địa chỉ_Phường Phú Diễn'))

WebUI.setText(findTestObject('Screen_Chi tiết yêu cầu/Screen_Chi tiết yêu cầu_Tab Thông tin hồ sơ/Screen_Chi tiết yêu cầu_Tab thông tin hồ sơ_Subtab Thông tin KH và NLQ/droplist_TT pháp lý KH_TT địa chỉ 2_Số nhà hoặc Tên đường'), 
    '136 Hồ Tùng Mậu')

WebUI.click(findTestObject('Screen_Chi tiết yêu cầu/Screen_Chi tiết yêu cầu_Tab Thông tin hồ sơ/Screen_Chi tiết yêu cầu_Tab thông tin hồ sơ_Subtab Thông tin KH và NLQ/button_TT pháp lý KH_TT địa chỉ 2_Lưu'))

WebUI.scrollToElement(findTestObject('Screen_Chi tiết yêu cầu/Screen_Chi tiết yêu cầu_Tab Thông tin hồ sơ/Screen_Chi tiết yêu cầu_Tab thông tin hồ sơ_Subtab Thông tin KH và NLQ/component_Thông tin người liên hệ'), 
    120)

Thread.sleep(2000)

WebUI.click(findTestObject('Screen_Chi tiết yêu cầu/Screen_Chi tiết yêu cầu_Tab Thông tin hồ sơ/Screen_Chi tiết yêu cầu_Tab thông tin hồ sơ_Subtab Thông tin KH và NLQ/droplist_TT người liên hệ 1_Quan hệ với người vay'))

WebUI.click(findTestObject('Screen_Chi tiết yêu cầu/Screen_Chi tiết yêu cầu_Tab Thông tin hồ sơ/Screen_Chi tiết yêu cầu_Tab thông tin hồ sơ_Subtab Thông tin KH và NLQ/droplistItem_TT người liên hệ 1_Khác'))

WebUI.setText(findTestObject('Screen_Chi tiết yêu cầu/Screen_Chi tiết yêu cầu_Tab Thông tin hồ sơ/Screen_Chi tiết yêu cầu_Tab thông tin hồ sơ_Subtab Thông tin KH và NLQ/textbox_TT người liên hệ 1_Họ và tên'), 
    'Nguyễn Văn A')

WebUI.setText(findTestObject('Screen_Chi tiết yêu cầu/Screen_Chi tiết yêu cầu_Tab Thông tin hồ sơ/Screen_Chi tiết yêu cầu_Tab thông tin hồ sơ_Subtab Thông tin KH và NLQ/textbox_TT người liên hệ 1_Số điện thoại'), 
    '0385943921')

WebUI.scrollToElement(findTestObject('Screen_Chi tiết yêu cầu/Screen_Chi tiết yêu cầu_Tab Thông tin hồ sơ/Screen_Chi tiết yêu cầu_Tab thông tin hồ sơ_Subtab Thông tin KH và NLQ/component_Thông tin người liên hệ'), 
    120)

Thread.sleep(2000)

WebUI.click(findTestObject('Screen_Chi tiết yêu cầu/Screen_Chi tiết yêu cầu_Tab Thông tin hồ sơ/Screen_Chi tiết yêu cầu_Tab thông tin hồ sơ_Subtab Thông tin KH và NLQ/button_Thông tin uy tín tín dụng_Tra cứu CIC'))

WebUI.click(findTestObject('Screen_Chi tiết yêu cầu/Screen_Chi tiết yêu cầu_Tab Thông tin hồ sơ/Screen_Chi tiết yêu cầu_Tab thông tin hồ sơ_Subtab Thông tin KH và NLQ/checkbox_Tra cứu CIC_Tổng hợp_Chọn tất cả'))

WebUI.click(findTestObject('Screen_Chi tiết yêu cầu/Screen_Chi tiết yêu cầu_Tab Thông tin hồ sơ/Screen_Chi tiết yêu cầu_Tab thông tin hồ sơ_Subtab Thông tin KH và NLQ/button_Tra cứu CIC_Tra cứu'))

WebUI.waitForElementNotPresent(findTestObject('Sidebar_Khay/pageLoading_Đang xử lý'), 120)

WebUI.click(findTestObject('Screen_Chi tiết yêu cầu/Screen_Chi tiết yêu cầu_Tab Thông tin hồ sơ/Screen_Chi tiết yêu cầu_Tab thông tin hồ sơ_Subtab Thông tin KH và NLQ/button_Tra cứu CIC_Đóng'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Screen_Chi tiết yêu cầu/Screen_Chi tiết yêu cầu_Tab Thông tin hồ sơ/Screen_Chi tiết yêu cầu_Tab thông tin hồ sơ_Subtab Thông tin KH và NLQ/button_Tra cứu CIC_Hủy'))

Thread.sleep(2000)

WebUI.scrollToElement(findTestObject('Screen_Chi tiết yêu cầu/Screen_Chi tiết yêu cầu_Tab Thông tin hồ sơ/Screen_Chi tiết yêu cầu_Tab thông tin hồ sơ_Subtab Thông tin KH và NLQ/component_Thông tin AML'), 
    0)

WebUI.click(findTestObject('Screen_Chi tiết yêu cầu/Screen_Chi tiết yêu cầu_Tab Thông tin hồ sơ/Screen_Chi tiết yêu cầu_Tab thông tin hồ sơ_Subtab Thông tin KH và NLQ/button_Thông tin AML_Đồng bộ'))

WebUI.waitForElementNotPresent(findTestObject('Sidebar_Khay/pageLoading_Đang xử lý'), 120)

WebUI.click(findTestObject('Screen_Chi tiết yêu cầu/Screen_Chi tiết yêu cầu_Các action xử lý/button_Lưu'))

WebUI.click(findTestObject('Screen_Chi tiết yêu cầu/Screen_Chi tiết yêu cầu_Các action xử lý/tab_Thông tin hồ sơ_Thông tin nguồn thu'))

