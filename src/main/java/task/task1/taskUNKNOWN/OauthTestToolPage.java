//package task.task1.task101;
//
//import com.codeborne.selenide.Selenide;
//import com.codeborne.selenide.SelenideElement;
//import io.qameta.allure.Step;
//import org.openqa.selenium.WindowType;
//import ru.rtlabs.pages.helper.PageHelper;
//import ru.rtlabs.test.core.Configuration;
//import ru.rtlabs.test.data.enums.oauth.GrantType;
//import ru.rtlabs.test.data.enums.oauth.Scope;
//
//import static com.codeborne.selenide.Condition.exist;
//import static com.codeborne.selenide.Condition.visible;
//import static com.codeborne.selenide.Selenide.$;
//
//public class OauthTestToolPage extends PageHelper {
//    private final String OAUTH_HOST = Configuration.HOST + "/oauth-test-tool";
//
//    private final SelenideElement redirectTeUri = $("#redirect_uri_te");
//    private final SelenideElement redirectAcUri = $("#redirect_uri_ac");
//    private final SelenideElement scopeInput = $("#scope");
//    private final SelenideElement clientIdDropDown = $("#client_id");
//    private final SelenideElement grantTypeDropDown = $("#grant_type");
//    private final SelenideElement responseTypeDropDown = $("#response_type");
//    private final SelenideElement displayPopupCheckbox = $("");
//    private final SelenideElement getTokerButton = $("");
//    private final SelenideElement errorMessage = $("#div.alert-danger.ng-scope");
//    private final SelenideElement accessToken = $("#access_token");
//    private final SelenideElement pkceCheckBox = $("input[ng-model='params.pkce']");
//
//    @Step("Открыть страницу утилиты для получения токена")
//    public OauthTestToolPage openOauthPage(){
//        Selenide.open(OAUTH_HOST);
//        return this;
//    }
//
//    @Step("Открыть страницу утилиты для получения токена в новой вкладке")
//    public OauthTestToolPage openOauthPageNewTab() {
//        Selenide.switchTo().newWindow(WindowType.TAB);
//        Selenide.open(OAUTH_HOST);
//        return this;
//    }
//
//    @Step("Указать скоуп")
//    public OauthTestToolPage setScope(Scope scope){
//        scopeInput.setValue(scope.getValue());
//        return this;
//    }
//
//    @Step("Указать скоуп")
//    public OauthTestToolPage setScope(String scope){
//        scopeInput.setValue(scope);
//        return this;
//    }
//
//    @Step("Указать grant_type")
//    public OauthTestToolPage selectGrantType(GrantType grantType){
//        grantTypeDropDown.selectOptionByValue(grantType.getValue());
//        return this;
//    }
//
//    @Step("Указать адрес redirect_uri_te")
//    public OauthTestToolPage setRedirectTeUri(String value){
//        redirectTeUri.scrollIntoView(true);
//        redirectTeUri.setValue(value);
//        return this;
//    }
//
//    @Step("Указать адрес redirect_uri_ac")
//    public OauthTestToolPage setRedirectAcUri(String value) {
//        redirectAcUri.scrollIntoView(true);
//        redirectAcUri.setValue(value);
//        return this;
//    }
//
//    @Step("Отключить открытие страницы логина в отдельном окне")
//    public OauthTestToolPage clickOnPcke(){
//        displayPopupCheckbox.scrollIntoView(true);
//        displayPopupCheckbox.click();
//        return this;
//    }
//
//    @Step("Нажать на кнопку получения токена")
//    public OauthTestToolPage clickOnGetTokenButton(){
//        getTokerButton.scrollIntoView(true);
//        getTokerButton.click();
//        return this;
//    }
//
//    @Step("Проверка, что сообщение об ошибке не отображается")
//    public SelenideElement errorMessageNotExist(){return errorMessage.shouldNot(exist);}
//
//    @Step("Проверка, что токен не отображается")
//    public String tokenMessageNotExist(){return errorMessage.shouldBe(visible).getText(); }
//
////    @Step("Получить адрес для редиректа /ac")
////    public String getRedirectAcUri(){
////
////    }
//
//
//
//
//
//}
