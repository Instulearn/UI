package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class LutfiPage extends BasePage {

    public LutfiPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    // Locators
    @FindBy(xpath = "//a[span[text()='Certificates']]")
    public WebElement certificatesButton;

    @FindBy(xpath = "//div[@id='certificatesCollapse']//a[@href='/panel/certificates']")
    public WebElement certificatesListLink;

    @FindBy(xpath = "//div[@id='certificatesCollapse']//a[@href='/panel/certificates/achievements']")
    public WebElement certificatesAchievementsLink;

    @FindBy(xpath = "//div[@id='certificatesCollapse']//a[@href='/certificate_validation']")
    public WebElement certificateValidationLink;

    @FindBy(xpath = "//div[@id='certificatesCollapse']//a[@href='/panel/certificates/webinars']")
    public WebElement completionCertificatesLink;

    @FindBy(xpath = "//h2[text()='Certificates statistics']")
    public WebElement certificateStatisticsTitle;

    @FindBy(xpath = "//span[text()='Active certificates']/preceding-sibling::strong")
    public WebElement activeCertificatesValue;

    @FindBy(xpath = "//span[text()='Student achievements']/preceding-sibling::strong")
    public WebElement studentAchievementsValue;

    @FindBy(xpath = "//span[text()='Failed students']/preceding-sibling::strong")
    public WebElement failedStudentsValue;

    @FindBy(xpath = "//span[text()='Average Grade']/preceding-sibling::strong")
    public WebElement averageGradeValue;

    // Filter Section
    @FindBy(xpath = "//label[text()='From']/following::input[@name='from'][1]")
    public WebElement fromDateInput;

    @FindBy(xpath = "//label[text()='To']/following::input[@name='to'][1]")
    public WebElement toDateInput;

    @FindBy(xpath = "//label[text()='Course']/following::select[@name='webinar_id']")
    public WebElement courseDropdown;

    @FindBy(xpath = "//label[text()='Quiz']/following::select[@id='quizFilter']")
    public WebElement quizDropdown;

    @FindBy(xpath = "//label[text()='Grade']/following::input[@name='grade']")
    public WebElement gradeInput;

    @FindBy(xpath = "//button[text()='Show Results']")
    public WebElement showResultsButton;

    // === Achievements Sayfası - İstatistikler ve Filtreler ===

    @FindBy(xpath = "//h2[text()='My certificates statistics']")
    public WebElement myCertificatesStatisticsTitle;

    @FindBy(xpath = "//span[text()='Certificates']/preceding-sibling::strong")
    public WebElement myCertificatesCount;

    @FindBy(xpath = "//span[text()='Average Grade']/preceding-sibling::strong")
    public WebElement myAverageGrade;

    @FindBy(xpath = "//span[text()='Failed Quizzes']/preceding-sibling::strong")
    public WebElement myFailedQuizzes;

    @FindBy(xpath = "//label[text()='From']/following::input[@name='from'][1]")
    public WebElement achievementsFromDateInput;

    @FindBy(xpath = "//label[text()='To']/following::input[@name='to'][1]")
    public WebElement achievementsToDateInput;

    @FindBy(xpath = "//label[text()='Course']/following::select[@name='webinar_id']")
    public WebElement achievementsCourseDropdown;

    @FindBy(xpath = "//label[text()='Quiz']/following::select[@id='quizFilter']")
    public WebElement achievementsQuizDropdown;

    @FindBy(xpath = "//label[text()='Grade']/following::input[@name='grade']")
    public WebElement achievementsGradeInput;

    @FindBy(xpath = "//button[text()='Show Results']")
    public WebElement achievementsShowResultsButton;

    @FindBy(xpath = "//h2[text()='My certificates']")
    public WebElement myCertificatesTitle;

    @FindBy(xpath = "//h2[contains(text(),'You have no certificate!')]")
    public WebElement noCertificateMessage;

    // === Certificate Validation Başlığı ve Açıklama ===
    @FindBy(xpath = "//h1[text()='Certificate Validation']")
    public WebElement certificateValidationTitle;

    @FindBy(xpath = "//p[contains(text(),'To validate certificates')]")
    public WebElement certificateValidationDescription;


    // === Sertifika ID input alanı ===
    @FindBy(xpath = "//label[text()='Certificate ID:']/following-sibling::input[@id='certificate_id']")
    public WebElement certificateIdInput;


    // === Captcha input alanı ===
    @FindBy(xpath = "//label[text()='Captcha']/following::input[@name='captcha'][1]")
    public WebElement captchaInput;


    // === Captcha görseli ===
    @FindBy(xpath = "//img[@id='captchaImageComment']")
    public WebElement captchaImage;


    // === Captcha yenile butonu ===
    @FindBy(xpath = "//button[@id='refreshCaptcha']")
    public WebElement refreshCaptchaButton;


    // === Validate butonu ===
    @FindBy(xpath = "//button[@id='formSubmit' and text()='Validate']")
    public WebElement validateButton;

    // === Sayfa başlığı ===
    @FindBy(xpath = "//h1[text()='Products']")
    public WebElement productsPageTitle;

    // === Ürün sayısı rozet alanı ===
    @FindBy(xpath = "//span[contains(@class, 'course-count-badge')]")
    public WebElement productsCountBadge;

    // === Arama input alanı ===
    @FindBy(xpath = "//input[@type='text' and @name='search']")
    public WebElement productSearchInput;

    // === Arama butonu ===
    @FindBy(xpath = "//button[@type='submit' and text()='Search']")
    public WebElement productSearchButton;

    // === 'Free' toggle switch ===
    @FindBy(xpath = "//input[@id='free']")
    public WebElement freeToggle;

    // === 'Free Shipping' toggle switch ===
    @FindBy(xpath = "//input[@id='free_shipping']")
    public WebElement freeShippingToggle;

    // === 'Discount' toggle switch ===
    @FindBy(xpath = "//input[@id='discount']")
    public WebElement discountToggle;

    // === Sort by dropdown ===
    @FindBy(xpath = "//select[@name='sort']")
    public WebElement sortByDropdown;

    // === 'Type' section - Virtual checkbox ===
    @FindBy(xpath = "//input[@id='filterTypesvirtual']")
    public WebElement typeVirtualCheckbox;

    // === 'Type' section - Physical checkbox ===
    @FindBy(xpath = "//input[@id='filterTypesphysical']")
    public WebElement typePhysicalCheckbox;

    // === 'Options' section - Only Available Products checkbox ===
    @FindBy(xpath = "//input[@id='filterOptionsOnlyAvailableProducts']")
    public WebElement onlyAvailableCheckbox;

    // === 'Type' filtrele butonu ===
    @FindBy(xpath = "(//button[text()='Filter items'])[1]")
    public WebElement typeFilterButton;

    // === 'Options' filtrele butonu ===
    @FindBy(xpath = "(//button[text()='Filter items'])[2]")
    public WebElement optionsFilterButton;

    // === 'Categories' başlığı ===
    @FindBy(xpath = "//h3[text()='Categories']")
    public WebElement categoriesTitle;

    // === Kategoriler listesindeki tüm linkler (toplu) ===
    @FindBy(xpath = "//h3[text()='Categories']/following-sibling::div//a")
    public List<WebElement> categoryLinks;

    // Tek bir ürün kartı için örnek, liste olarak kullanmak için index kaldırılabilir

    // Satıcı adı (user name)
    @FindBy(xpath = "(//div[contains(@class,'product-card')]//a[contains(@class,'user-name')])[INDEX]")
    public WebElement sellerName;

    // Ürün adı (product title)
    @FindBy(xpath = "(//div[contains(@class,'product-card')]//h3[contains(@class,'product-title')])[INDEX]")
    public WebElement productName;

    // Ürün açıklaması (description) - Burada kategori linkinin metni kullanılmış (örnek description yoksa burayı değiştir)
    // Eğer description alanı yoksa, kategori adı veya ürünün altında başka açıklama olabilir. Bu örnekte kategori span:
    @FindBy(xpath = "(//div[contains(@class,'product-card')]//span[contains(text(),'in')]/a)[INDEX]")
    public WebElement productDescription;

    // Fiyat
    @FindBy(xpath = "(//div[contains(@class,'product-card')]//div[contains(@class,'product-price-box')]//span[contains(@class,'real')])[INDEX]")
    public WebElement productPrice;

    @FindBy(xpath = "//div[contains(@class,'product-card')]//a[contains(@class,'user-name')]")
    public List<WebElement> sellerNames;

    @FindBy(xpath = "//div[contains(@class,'product-card')]//h3[contains(@class,'product-title')]")
    public List<WebElement> productNames;

    @FindBy(xpath = "//div[contains(@class,'product-card')]//span[contains(text(),'in')]/a")
    public List<WebElement> productDescriptions;

    @FindBy(xpath = "//div[contains(@class,'product-card')]//div[contains(@class,'product-price-box')]//span[contains(@class,'real')]")
    public List<WebElement> productPrices;

    @FindBy(xpath = "//h1[contains(@class, 'font-30')]")
    public WebElement productTitle;

    @FindBy(xpath = "//span[contains(text(), 'in')]/a")
    public WebElement productCategoryLink;

    @FindBy(xpath = "//div[contains(@class, 'stars-card')]//svg[contains(@class, 'feather-star active')]")
    public List<WebElement> activeStars;  // Dolmuş yıldızlar

    @FindBy(xpath = "//div[contains(@class, 'stars-card')]//span[contains(@class, 'badge-primary')]")
    public WebElement productRating;

    @FindBy(xpath = "//span[contains(@class, 'product-availability-badge')]")
    public WebElement productAvailability;

    @FindBy(xpath = "//div[contains(@class, 'product-show-price-box')]//span[contains(@class, 'real')]")
    public WebElement inProductPrice;

    @FindBy(xpath = "(//button[@type='submit'])[2]")
    public WebElement addToCartButton;

    @FindBy(xpath = "//button[@class='btn btn-outline-danger mt-20 ml-0 ml-md-10 js-product-direct-payment']")
    public WebElement buyNowButton;

    @FindBy(xpath = "//textarea[@name='review_text']")
    public WebElement reviewTextArea;

    @FindBy(xpath = "//form[contains(@action, '/reviews')]//button[@type='submit']")
    public WebElement reviewSubmitButton;

    @FindBy(xpath = "//li[contains(@class,'sidenav-item')]//a[span[text()='Certificates']]")
    public WebElement certificatesMenuHeader;

    @FindBy(xpath = "//div[@id='certificatesCollapse']//a[text()='Achievements']")
    public WebElement achievementsLink;

    @FindBy(xpath = "//*[contains(text(), 'Achievements')]")
    public WebElement achievementsButton;

    @FindBy(xpath = "//*[contains(text(), 'Certificate Validation')]")
    public WebElement certificateValidationButton;

    @FindBy(xpath = "//*[contains(text(), 'Completion Certificates')]")
    public WebElement completionCertificatesButton;

    @FindBy(xpath = "//h2[text()='Filter certificates']")
    public WebElement filterCertificatesTitle;

    @FindBy(xpath = "//option[text()='Chocolate Technology']")
    public WebElement achievementsCourseChocolateTechnology;

    @FindBy(xpath = "(//option[text()='Chocolate Technology'])[2]")
    public WebElement achievementsQuizChocolateTechnology;

    @FindBy(xpath = "(//*[text()='Chocolate Technology'])[2]")
    public WebElement myCertificateChocolateTechnology;

    @FindBy(xpath = "//input[@id='certificate_id']")
    public WebElement certificateValidationCertificateIDTextbox;

    @FindBy(xpath = "(//h3[text()='Certificate is valid'])[2]")
    public WebElement certificateIsValidScreen;

    @FindBy(xpath = "(//button[text()='Close'])[2]")
    public WebElement certificateIsValidScreenCloseButton;

    @FindBy(xpath = "//*[text()='Home']")
    public WebElement dashboardHomeButton;

    @FindBy(xpath = "//*[text()='Store']")
    public WebElement homePageStoreButton;

    @FindBy(xpath = "//h3[text()='Options']")
    public WebElement productsFilterOptionsSide;

    @FindBy(xpath = "(//*[text()='Only available products']")
    public WebElement onlyAvailableCB;

    @FindBy(xpath = "(//div[@class='image-box'])[1]")
    public WebElement firstFilteredProduct;

    @FindBy(xpath = "(//h3[@class='mt-15 product-title font-weight-bold font-16 text-dark-blue'])[1]")
    public WebElement firstFilteredProductProdName;

    @FindBy(xpath = "(//a[@class='user-name ml-5 font-14'])[1]")
    public WebElement firstFilteredProductSellerName;

    @FindBy(xpath = "(//a[@class='text-decoration-underline'])[1]")
    public WebElement firstFilteredProductCategoryName;

    @FindBy(xpath = "//a[@id='description-tab']")
    public WebElement descriptionPart;

    @FindBy(xpath = "//div[@class='stars-card d-flex align-items-center mt-0']")
    public WebElement productPoint;

    @FindBy(xpath = "//*[text()='Comments ']")
    public WebElement productCommentsTitle;

    @FindBy(xpath = "//textarea[@name='comment']")
    public WebElement productCommentsTextArea;

    @FindBy(xpath = "//*[text()='Post comment']")
    public WebElement productPostCommentButton;


    @FindBy(xpath = "//h2[text()='Comment sent successfully!']")
    public WebElement productSuccessSend;

    @FindBy(xpath = "//h1[text()='Shopping Cart']")
    public WebElement shoppingCartTitle;

    @FindBy(xpath = "//h3[text()='Painting tools']")
    public WebElement cartPaintingTitle;







































}
