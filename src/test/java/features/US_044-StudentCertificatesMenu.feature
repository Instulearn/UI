Feature: US_044 Student - Sertifikaların Görünürlüğü ve Yönetimi İçim Sayfanın Varlığı

  kullanıcı anasayfaya gider

  @wip_LE
  Scenario: TC_44.1 Student - Dashboard sidebar'da Certificates başlığı altında 'Achivements','Certificate Validation',
  'Completion Certificates' linkleri görünür ve aktif olmasının testi

    * Kullanıcı ana sayfaya gider
    * Kullanıcı login butonuna tıklar
    * Kullanıcı "lutfi.student@instulearn.com" ve "Learn.1406" ile login olur
    * Student Dashboard sidebar'da Certificates başlığı olduğunu doğrular
    * Student Certificate başlığına tıklar
    * Student - Achivements, Certificate Validation, Completion Certificates linklerinin görünür olduğunu doğrular.

  @wip_LE
  Scenario: TC_44.3 Student - Achivements butonuna tıklandığında My achievements statistics bilgilerinin sayfada görünür olmasının ve seçilen sertifika üzerinde ilgili işlemlerin yapılabilmesinin testi

    * Kullanıcı ana sayfaya gider
    * Kullanıcı login butonuna tıklar
    * Kullanıcı "lutfi.student@instulearn.com" ve "Learn.1406" ile login olur
    * Student Dashboard sidebar'da Certificates başlığı olduğunu doğrular
    * Student Certificate başlığına tıklar
    * Student Achievements başlığına tıklandığında My Certificates statistics, filter certificates & my certificates kısımları görünür olmalıdır
    * From textbox'ı seçilebilir olmalıdır
    * To textbox'ı seçilebilir olmalıdır
    * Course dropdown menüsüne tıklanabilmeli ve Chocolate Technology seçilebilir olmalıdır
    * Quiz dropdown menüsüne tıklanabilmeli ve Chocolate Technology seçilebilir olmalıdır
    * Kullanıcı Show result butonuna tıkladığında My Certificate kısmında Chocolate Technology seçilmiş olmalıdır.

  @wip_LE
  Scenario: TC_44.4 Student - Dashboard Sidebar'da 'Certificate Validation' linkine tıklandığında sertifika doğrulama sayfasına yönlendirmesinin testi


    * Kullanıcı ana sayfaya gider
    * Kullanıcı login butonuna tıklar
    * Kullanıcı "lutfi.student@instulearn.com" ve "Learn.1406" ile login olur
    * Student Dashboard sidebar'da Certificates başlığı olduğunu doğrular
    * Student Certificate başlığına tıklar
    * Student certificate validation başlığına tıklar

  @wip_LE
  Scenario: TC_44.5 Student -  geçerli sertifika id ve captcha girdiğinde doğrulamanın başarılı olarak gerçekleşmesi testi
    * Kullanıcı ana sayfaya gider
    * Kullanıcı login butonuna tıklar
    * Kullanıcı "lutfi.student@instulearn.com" ve "Learn.1406" ile login olur
    * Student Dashboard sidebar'da Certificates başlığı olduğunu doğrular
    * Student Certificate başlığına tıklar
    * Student certificate validation başlığına tıklar
    * Student certificate ID textboxına 49 değerini girer
    * Kullanıcı captcha değerini girer
    * Kullanıcı validate butonuna tıklar
    * Kullanıcı ekranı kapatır.

  @wip_LE
  Scenario: TC_44.6 'Complated Certificate' linkine tıkladığında tamamlanmış sertifikalar listesinde filtrelenen
  sertifikalar görüntülenebilmeli ve seçilen sertifika üzerinde ilgili işlemlerin yapılabilmesi testi

    * Kullanıcı ana sayfaya gider
    * Kullanıcı login butonuna tıklar
    * Kullanıcı "lutfi.student@instulearn.com" ve "Learn.1406" ile login olur
    * Student Dashboard sidebar'da Certificates başlığı olduğunu doğrular
    * Student Certificate başlığına tıklar
    * Student completion certificates başlığını tıklar
    * From textbox'ı seçilebilir olmalıdır
    * To textbox'ı seçilebilir olmalıdır
    * Course dropdown menüsüne tıklanabilmeli ve Chocolate Technology seçilebilir olmalıdır
    * Kullanıcı Show result butonuna tıkladığında My Certificate kısmında Chocolate Technology seçilmiş olmalıdır.

