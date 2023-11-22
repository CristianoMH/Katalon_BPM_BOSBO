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

WebUI.callTestCase(findTestCase('TCs_Luồng cấp mới/TCs_Tìm kiếm và khởi tạo/TCs_Khởi tạo yêu cầu'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Screen_Chi tiết yêu cầu/Screen_Chi tiết yêu cầu_Tab Thông tin hồ sơ/Screen_Chi tiết yêu cầu_Tab Thông tin hồ sơ_Subtab Thông tin khởi tạo/droplist_Luồng phê duyệt'))

WebUI.click(findTestObject('Screen_Chi tiết yêu cầu/Screen_Chi tiết yêu cầu_Tab Thông tin hồ sơ/Screen_Chi tiết yêu cầu_Tab Thông tin hồ sơ_Subtab Thông tin khởi tạo/droplistItem_Luồng phê duyệt_Luồng phê duyệt tại HO'))

WebUI.click(findTestObject('Screen_Chi tiết yêu cầu/Screen_Chi tiết yêu cầu_Tab Thông tin hồ sơ/Screen_Chi tiết yêu cầu_Tab Thông tin hồ sơ_Subtab Thông tin khởi tạo/droplist_Luồng trình'))

WebUI.click(findTestObject('Screen_Chi tiết yêu cầu/Screen_Chi tiết yêu cầu_Tab Thông tin hồ sơ/Screen_Chi tiết yêu cầu_Tab Thông tin hồ sơ_Subtab Thông tin khởi tạo/droplistItem_Luồng trình_Luồng thường'))

WebUI.click(findTestObject('Screen_Chi tiết yêu cầu/Screen_Chi tiết yêu cầu_Tab Thông tin hồ sơ/Screen_Chi tiết yêu cầu_Tab Thông tin hồ sơ_Subtab Thông tin khởi tạo/droplist_Phân khúc khách hàng'))

WebUI.click(findTestObject('Screen_Chi tiết yêu cầu/Screen_Chi tiết yêu cầu_Tab Thông tin hồ sơ/Screen_Chi tiết yêu cầu_Tab Thông tin hồ sơ_Subtab Thông tin khởi tạo/droplistItem_Phân khúc khách hàng_SBO'))

WebUI.setText(findTestObject('Screen_Chi tiết yêu cầu/Screen_Chi tiết yêu cầu_Tab Thông tin hồ sơ/Screen_Chi tiết yêu cầu_Tab Thông tin hồ sơ_Subtab Thông tin khởi tạo/textbox_Mã đối tác'), 
    MaDoiTac_Valid)

WebUI.click(findTestObject('Screen_Chi tiết yêu cầu/Screen_Chi tiết yêu cầu_Các action xử lý/button_Lưu'))

