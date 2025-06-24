package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class FurkanPage {
    @FindBy(xpath = "//li[contains(@class,'sidenav-item')]//a[span[text()='Quizzes']]")
    public WebElement quizzesMenuHeader;

    @FindBy(xpath = "//div[@id='quizzesCollapse']//a[text()='New quiz']")
    public WebElement newQuizLink;

    @FindBy(xpath = "//div[@id='quizzesCollapse']//a[text()='List']")
    public WebElement listLink;

    @FindBy(xpath = "//div[@id='quizzesCollapse']//a[text()='Results']")
    public WebElement resultsLink;

    @FindBy(xpath = "//div[@id='quizzesCollapse']//a[text()='My results']")
    public WebElement myResultsLink;

    @FindBy(xpath = "//div[@id='quizzesCollapse']//a[text()='Not Participated']")
    public WebElement notParticipatedLink;

    @FindBy(xpath = "//input[contains(@class,'js-ajax-title')]")
    public WebElement quizTitleInput;

    @FindBy(xpath = "//input[contains(@class,'js-ajax-pass_mark')]")
    public WebElement passMarkInput;

    @FindBy(xpath = "//select[contains(@class,'js-ajax-webinar_id')]")
    public WebElement courseSelectDropdown;

    @FindBy(xpath = "//button[contains(text(),'Save') or contains(text(),'Create') or contains(text(),'Submit')]")
    public WebElement saveButton;  // Eğer sayfada formu kaydeden buton varsa

    // Alternatif olarak, formu submit eden buton yoksa, form elementini yakalayıp submit edebilirsin:
    @FindBy(xpath = "//form[contains(@id,'newQuizForm') or contains(@id,'form')]")
    public WebElement newQuizForm;

    @FindBy(xpath = "//button[@id='add_multiple_question']")
    public WebElement addMultipleChoiceButton;

    @FindBy(xpath = "//input[contains(@class,'js-question-title') or @name='question_title']")
    public WebElement questionTitleInput;

    @FindBy(xpath = "//input[contains(@class,'js-question-grade') or @name='grade']")
    public WebElement gradeInput;

    @FindBy(xpath = "//input[contains(@class,'js-correct-answer') or contains(@name,'correct_answer')]")
    public WebElement correctAnswerInput;

    // Çoklu seçenek eklemek için örnek olarak seçenek inputları
    @FindBy(xpath = "//input[contains(@class,'js-question-option') or contains(@name,'option')]")
    public List<WebElement> questionOptionsInputs;

    // Yeni seçenek eklemek için eğer varsa buton
    @FindBy(xpath = "//button[contains(text(),'Add option') or contains(text(),'Add choice')]")
    public WebElement addOptionButton;








    
    @FindBy(xpath = "//button[@id='add_descriptive_question']")
    public WebElement addDescriptiveButton;

    @FindBy(xpath = "//textarea[contains(@class,'js-description-correct-answer') or contains(@name,'correct_answer_description')]")
    public WebElement descriptionCorrectAnswerTextarea;

    @FindBy(xpath = "//button[contains(text(),'Save') or contains(text(),'Add Question')]")
    public WebElement saveDescriptiveQuestionButton;



}
