Feature: Instructor - Kayıtlı bir kullanıcı olarak sitede sertifikalarımı gorup yonetebilecegim
  bir alan olmasını istiyorum

  @wip_LE_26
  Scenario: TC_26.1 Instructor'ın Dashboard sidebar'da Certificates baslıgı altında 'List' ,'Achivements',
  'Certificate Validation','Completion Certificates' linkleri görünürlük ve aktiflik testi

    * Kullanıcı ana sayfaya gider
    * Kullanıcı login butonuna tıklar
    * Kullanıcı "lutfi.teacher@instulearn.com" ve "Learn.1406" ile login olur
    * Instructor Dashboard sidebar'da Certificates başlığı olduğunu doğrular
    * Instructor Certificate başlığına tıklar
    * Instreuctor - List, Achivements, Certificate Validation, Completion Certificates linklerinin görünür olduğunu doğrular.

  @wip_LE_26
  Scenario: TC_26.2 Instructor'ın 'List' ikonuna tıkladığında Certificate statistics bilgilerinin sayfada görünür
  olması ve aktif sertifikalar listesinde filtrelenen sertifikaların görüntülenebilmesi testi

    * Kullanıcı ana sayfaya gider
    * Kullanıcı login butonuna tıklar
    * Kullanıcı "lutfi.teacher@instulearn.com" ve "Learn.1406" ile login olur
    * Instructor Dashboard sidebar'da Certificates başlığı olduğunu doğrular
    * Instructor Certificate başlığına tıklar
    * Instreuctor - List, Achivements, Certificate Validation, Completion Certificates linklerinin görünür olduğunu doğrular.
    * Instructor - List'e tıklar.
    * From textbox'ı seçilebilir olmalıdır
    * To textbox'ı seçilebilir olmalıdır
    * Course dropdown menüsüne tıklanabilmeli ve Dairy Technology seçilebilir olmalıdır
    * Quiz dropdown menüsüne tıklanabilmeli ve Dairy Tech Quiz seçilebilir olmalıdır
    * Kullanıcı Show result butonuna tıkladığında Active Certificate kısmında Dairy Tech Quiz seçilmiş olmalıdır.

  @wip_LE_26
  Scenario: TC_26.3 Instructor'ın certificate kısmında filtreleme ikonlarının seçilebilmesinin testi

    * Kullanıcı ana sayfaya gider
    * Kullanıcı login butonuna tıklar
    * Kullanıcı "lutfi.teacher@instulearn.com" ve "Learn.1406" ile login olur
    * Instructor Dashboard sidebar'da Certificates başlığı olduğunu doğrular
    * Instructor Certificate başlığına tıklar
    * Instreuctor - List, Achivements, Certificate Validation, Completion Certificates linklerinin görünür olduğunu doğrular.
    * Instructor - List'e tıklar.
    * From textbox'ı seçilebilir olmalıdır
    * To textbox'ı seçilebilir olmalıdır
    * Grade textbox'ı seçilebilir olmalıdır.
    * Course dropdown menüsüne tıklanabilmeli ve Dairy Technology seçilebilir olmalıdır
    * Quiz dropdown menüsüne tıklanabilmeli ve Dairy Tech Quiz seçilebilir olmalıdır

  @wip_LE_26
  Scenario: TC_26.4 Instructor'ın Dashboard sidebar'ında 'Achivements' linkine tıklandığında
  My achievements statistics bilgilerinin sayfada görünür olmasının ve seçilen sertifika üzerinde ilgili işlemlerin
  yapılabilmesinin testi

    * Kullanıcı ana sayfaya gider
    * Kullanıcı login butonuna tıklar
    * Kullanıcı "lutfi.teacher@instulearn.com" ve "Learn.1406" ile login olur
    * Instructor Dashboard sidebar'da Certificates başlığı olduğunu doğrular
    * Instructor Certificate başlığına tıklar
    * Instreuctor - List, Achivements, Certificate Validation, Completion Certificates linklerinin görünür olduğunu doğrular.
    * Instructor - Achievements'a tıklar.
    * Instructor Achievements başlığına tıklandığında My Certificates statistics, filter certificates & my certificates kısımları görünür olmalıdır
    * From textbox'ı seçilebilir olmalıdır
    * To textbox'ı seçilebilir olmalıdır
    * Grade textbox'ı seçilebilir olmalıdır.
    * Course dropdown menüsüne tıklanabilmeli ve Chocolate Technology seçilebilir olmalıdır
    * Quiz dropdown menüsüne tıklanabilmeli ve Chocolate Technology seçilebilir olmalıdır


  @wip_LE_26
  Scenario: TC_26.5 Instructor'ın Dashboard Sidebar'da 'Certificate Validation' linkine tıklandığında
  sertifika doğrulama sayfasına yönlendirmesinin testi


    * Kullanıcı ana sayfaya gider
    * Kullanıcı login butonuna tıklar
    * Kullanıcı "lutfi.teacher@instulearn.com" ve "Learn.1406" ile login olur
    * Instructor Certificate başlığına tıklar
    * Instructor certificate validation başlığına tıklar

  @wip_LE_26
  Scenario: TC_26.6 Instructor'ın geçerli sertifika id ve captcha girdiğinde doğrulamanın başarılı olarak
  gerçekleşmesi testi

    * Kullanıcı ana sayfaya gider
    * Kullanıcı login butonuna tıklar
    * Kullanıcı "lutfi.teacher@instulearn.com" ve "Learn.1406" ile login olur
    * Instructor Certificate başlığına tıklar
    * Instructor certificate validation başlığına tıklar
    * Instructor certificate ID textboxına 47 değerini girer
    * Kullanıcı captcha değerini girer
    * Kullanıcı validate butonuna tıklar
    * Kullanıcı ekranı kapatır.


  @wip_LE_26
  Scenario: TC_26.7 Instructor'ın Dashboard sidebar'da 'Complated Certificate' linkine tıkladığında tamamlanmış
  sertifikalar listesinde filtrelenen sertifikalar görüntülenebilmeli ve seçilen sertifika üzerinde ilgili işlemlerin
  yapılabilmesi testi

    * Kullanıcı ana sayfaya gider
    * Kullanıcı login butonuna tıklar
    * Kullanıcı "lutfi.teacher@instulearn.com" ve "Learn.1406" ile login olur
    * Instructor Certificate başlığına tıklar
    * Instructor completion certificates başlığını tıklar
    * From textbox'ı seçilebilir olmalıdır
    * To textbox'ı seçilebilir olmalıdır
    * Course dropdown menüsüne tıklanabilmeli ve Chocolate Technology seçilebilir olmalıdır
    * Kullanıcı Show result butonuna tıkladığında My Certificate kısmında Chocolate Technology seçilmiş olmalıdır.



