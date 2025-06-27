package pages;

import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class FurkanPage extends BasePage {

    public FurkanPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    // Dashboard Sidebar - Quizzes Section
    @Getter
    @FindBy(xpath = "//a[@href='#quizzesCollapse']")
    private WebElement quizzesSection;

    @Getter
    @FindBy(xpath = "//a[@href='/panel/quizzes/new']")
    private WebElement newQuizLink;

    @Getter
    @FindBy(xpath = "//a[@href='/panel/quizzes']")
    private WebElement listLink;

    @Getter
    @FindBy(xpath = "//a[@href='/panel/quizzes/results']")
    private WebElement resultsLink;

    @Getter
    @FindBy(xpath = "//a[@href='/panel/quizzes/my-results']")
    private WebElement myResultsLink;

    @Getter
    @FindBy(xpath = "//a[@href='/panel/quizzes/opens']")
    private WebElement notParticipatedLink;

    // New Quiz Form Elements
    @Getter
    @FindBy(xpath = "//input[@name='ajax[new][title]']")
    private WebElement quizTitleField;

    @Getter
    @FindBy(xpath = "//input[@class='js-ajax-title form-control']")
    private WebElement quizTitleFieldByClass;

    @Getter
    @FindBy(xpath = "//input[@name='ajax[new][pass_mark]']")
    private WebElement passMarkField;

    @Getter
    @FindBy(xpath = "//input[@class='js-ajax-pass_mark form-control']")
    private WebElement passMarkFieldByClass;

    @Getter
    @FindBy(xpath = "//select[@name='ajax[new][webinar_id]']")
    private WebElement courseSelectDropdown;

    @Getter
    @FindBy(xpath = "//select[@class='js-ajax-webinar_id custom-select']")
    private WebElement courseSelectByClass;

    @Getter
    @FindBy(xpath = "//button[@class='js-submit-quiz-form btn btn-sm btn-primary']")
    private WebElement createQuizButton;

    @Getter
    @FindBy(xpath = "//button[contains(@class,'js-submit-quiz-form') and contains(text(),'Create')]")
    private WebElement createQuizButtonByText;

    @Getter
    @FindBy(xpath = "//div[contains(@class,'success') or contains(@class,'alert') or contains(text(),'success')]")
    private WebElement successMessage;

    @Getter
    @FindBy(xpath = "//h2[contains(@class,'section-title') and contains(text(),'New quiz')]")
    private WebElement newQuizPageTitle;

    @Getter
    @FindBy(xpath = "//div[@class='js-content-form quiz-form webinar-form']")
    private WebElement newQuizForm;

    // Multiple Choice Question Elements
    @Getter
    @FindBy(xpath = "//button[@id='add_multiple_question' or contains(text(),'Add a multiple choice') or contains(text(),'multiple choice')]")
    private WebElement addMultipleChoiceButton;

    // Modal içindeki question form elements
    @Getter
    @FindBy(xpath = "//div[contains(@class,'swal2-popup')]//input[@name='ajax[title]']")
    private WebElement questionTitleField;

    @Getter
    @FindBy(xpath = "//div[contains(@class,'swal2-popup')]//input[@class='js-ajax-title form-control']")
    private WebElement questionTitleFieldByClass;

    @Getter
    @FindBy(xpath = "//div[contains(@class,'swal2-popup')]//input[@name='ajax[grade]']")
    private WebElement gradeField;

    @Getter
    @FindBy(xpath = "//div[contains(@class,'swal2-popup')]//input[@class='js-ajax-grade form-control']")
    private WebElement gradeFieldByClass;

    // Answer elements
    @Getter
    @FindBy(xpath = "//div[contains(@class,'swal2-popup')]//input[@name='ajax[answers][ans_temp][title]']")
    private WebElement answerTitleField;

    @Getter
    @FindBy(xpath = "//div[contains(@class,'swal2-popup')]//input[contains(@id,'correctAnswerSwitch')]")
    private WebElement correctAnswerSwitch;

    @Getter
    @FindBy(xpath = "//div[contains(@class,'swal2-popup')]//button[contains(@class,'add-answer-btn')]")
    private WebElement addAnswerButton;

    @Getter
    @FindBy(xpath = "//div[contains(@class,'swal2-popup')]//button[contains(@class,'save-question')]")
    private WebElement saveQuestionButton;

    @Getter
    @FindBy(xpath = "//div[contains(@class,'swal2-popup')]//button[contains(@class,'close-swl')]")
    private WebElement closeModalButton;

    @Getter
    @FindBy(xpath = "//div[contains(@class,'question-saved') or contains(text(),'Question saved')]")
    private WebElement questionSavedMessage;

    // Descriptive Question Elements
    @Getter
    @FindBy(xpath = "//button[@id='add_descriptive_question' or contains(text(),'Add a Descriptive')]")
    private WebElement addDescriptiveButton;

    // Descriptive question modal'ında sadece "Correct answer" textarea'sı var, description field yok
    @Getter
    @FindBy(xpath = "//div[contains(@class,'swal2-popup')]//textarea[@name='ajax[correct]']")
    private WebElement correctAnswerDescField;

    @Getter
    @FindBy(xpath = "//div[contains(@class,'swal2-popup')]//textarea[@class='js-ajax-correct form-control']")
    private WebElement correctAnswerDescFieldByClass;

    @Getter
    @FindBy(xpath = "//div[contains(@class,'descriptive-saved') or contains(text(),'Descriptive question saved')]")
    private WebElement descriptiveQuestionSavedMessage;

    // Quiz List Page Elements
    @Getter
    @FindBy(xpath = "//div[contains(@class,'activities-container')]")
    private WebElement statisticsSection;

    @Getter
    @FindBy(xpath = "//input[@name='total_mark']")
    private WebElement quizFilterField;

    // Dropdown menü için elements (table-actions içindeki)
    @Getter
    @FindBy(xpath = "//div[contains(@class,'table-actions')]//button[@data-toggle='dropdown']")
    private WebElement dropdownToggleButton;

    @Getter
    @FindBy(xpath = "//div[contains(@class,'table-actions')]//button[contains(@class,'dropdown-toggle')]")
    private WebElement dropdownToggleByClass;

    @Getter
    @FindBy(xpath = "//div[contains(@class,'dropdown-menu')]")
    private WebElement dropdownMenu;

    @Getter
    @FindBy(xpath = "//a[contains(@href,'/edit') and contains(text(),'Edit')]")
    private WebElement quizEditButton;

    @Getter
    @FindBy(xpath = "//div[contains(@class,'dropdown-menu')]//a[contains(@href,'/edit')]")
    private WebElement quizEditButtonInDropdown;

    @Getter
    @FindBy(xpath = "//a[contains(@href,'/delete') and contains(text(),'Delete')]")
    private WebElement quizDeleteButton;

    @Getter
    @FindBy(xpath = "//div[contains(@class,'dropdown-menu')]//a[contains(@href,'/delete')]")
    private WebElement quizDeleteButtonInDropdown;

    // İlk satırdaki quiz için spesifik dropdown toggle
    @Getter
    @FindBy(xpath = "(//div[contains(@class,'table-actions')]//button[@data-toggle='dropdown'])[1]")
    private WebElement firstQuizDropdownToggle;

    // İlk satırdaki quiz için spesifik edit butonu
    @Getter
    @FindBy(xpath = "(//div[contains(@class,'dropdown-menu')]//a[contains(@href,'/edit')])[1]")
    private WebElement firstQuizEditButton;

    @Getter
    @FindBy(xpath = "//div[contains(@class,'delete-success') or contains(text(),'successfully deleted')]")
    private WebElement deleteSuccessMessage;

    // Delete confirmation modal elements
    @Getter
    @FindBy(xpath = "//button[@id='swlDelete']")
    private WebElement confirmDeleteButton;

    @Getter
    @FindBy(xpath = "//button[contains(@class,'close-swl')]")
    private WebElement cancelDeleteButton;

    @Getter
    @FindBy(xpath = "//div[contains(@class,'swal2-popup')]")
    private WebElement deleteConfirmationModal;

    @Getter
    @FindBy(xpath = "//h2[@id='swal2-title' and contains(text(),'Are you sure')]")
    private WebElement deleteConfirmationTitle;

    // Results Page Elements
    @Getter
    @FindBy(xpath = "//input[@name='from']")
    private WebElement resultsFromDateField;

    @Getter
    @FindBy(xpath = "//input[@name='to']")
    private WebElement resultsToDateField;

    @Getter
    @FindBy(xpath = "//select[@name='quiz_id']")
    private WebElement resultsQuizDropdown;

    @Getter
    @FindBy(xpath = "//select[@name='user_id']")
    private WebElement resultsStudentDropdown;

    @Getter
    @FindBy(xpath = "//select[@name='status']")
    private WebElement resultsStatusDropdown;

    @Getter
    @FindBy(xpath = "//button[@type='submit' and contains(text(),'Show Results')]")
    private WebElement showResultsButton;

    // Fallback for general filter field
    @Getter
    @FindBy(xpath = "//input[contains(@class,'results-filter') or contains(@placeholder,'Filter results')]")
    private WebElement resultsFilterField;

    @Getter
    @FindBy(xpath = "//button[contains(@class,'view-result') or contains(text(),'View')]")
    private WebElement viewResultButton;

    @Getter
    @FindBy(xpath = "//button[contains(@class,'delete-result') or contains(text(),'Delete')]")
    private WebElement deleteResultButton;

    // Results statistics section
    @Getter
    @FindBy(xpath = "//h2[contains(text(),'Results statistics')]")
    private WebElement resultsStatisticsTitle;

    @Getter
    @FindBy(xpath = "//div[contains(@class,'no-result')]")
    private WebElement noResultsMessage;

    // My Results Page Elements
    @Getter
    @FindBy(xpath = "//button[contains(@class,'view-answer') or contains(text(),'View Answer')]")
    private WebElement viewAnswerButton;

    @Getter
    @FindBy(xpath = "//button[contains(@class,'course-button') or contains(text(),'Course')]")
    private WebElement courseButton;

    // Not Participated Page Elements
    @Getter
    @FindBy(xpath = "//button[contains(@class,'start-quiz') or contains(text(),'Start')]")
    private WebElement startButton;

    @Getter
    @FindBy(xpath = "//button[contains(@class,'course-page') or contains(text(),'Course Page')]")
    private WebElement coursePageButton;

    // Utility Methods for Dynamic Elements
    public WebElement getQuizLink(String linkName) {
        String xpath;
        switch (linkName) {
            case "New Quiz":
            case "New quiz":
                xpath = "//a[@href='/panel/quizzes/new']";
                break;
            case "List":
                xpath = "//a[@href='/panel/quizzes']";
                break;
            case "Results":
                xpath = "//a[@href='/panel/quizzes/results']";
                break;
            case "My Results":
            case "My results":
                xpath = "//a[@href='/panel/quizzes/my-results']";
                break;
            case "Not Participated":
                xpath = "//a[@href='/panel/quizzes/opens']";
                break;
            default:
                xpath = String.format("//div[@id='quizzesCollapse']//a[contains(text(),'%s')]", linkName);
        }
        return driver.findElement(org.openqa.selenium.By.xpath(xpath));
    }

    public WebElement getCorrectAnswerOption(String optionText) {
        String xpath = String.format("//input[@value='%s' or following-sibling::text()[contains(.,'%s')]]", optionText, optionText);
        return driver.findElement(org.openqa.selenium.By.xpath(xpath));
    }

    // Existing elements (keeping compatibility)
    @Getter
    @FindBy(xpath = "//li[contains(@class,'sidenav-item')]//a[span[text()='Quizzes']]")
    private WebElement quizzesMenuHeader;

    @Getter
    @FindBy(xpath = "//input[contains(@class,'js-ajax-title')]")
    private WebElement quizTitleInput;

    @Getter
    @FindBy(xpath = "//input[contains(@class,'js-ajax-pass_mark')]")
    private WebElement passMarkInput;



    @Getter
    @FindBy(xpath = "//button[contains(text(),'Save') or contains(text(),'Create') or contains(text(),'Submit')]")
    private WebElement saveButton;

    @Getter
    @FindBy(xpath = "//button[contains(text(),'Save') or contains(text(),'Add Question')]")
    private WebElement saveDescriptiveQuestionButton;
}