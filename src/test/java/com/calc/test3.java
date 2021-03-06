package calc;

/* Подключение библиотеки JUnit, позволяющая создавать тесты для программ */
import org.junit.Assert;
import org.junit.Test;

/* Создание класса, содержащего код теста */
public class test3 {
    
	/* Аннотация @Test указывает JUnit, что в методе находится код теста */
    @Test
    public void testCalculator(){
		/* Обработка исключения на случай возникновения ошибок в процессе выполнения теста */
        try{
			/* Создание объекта класса, содержащего программу */
            Calculator lc = new Calculator();
			/* Заполнение поля ввода программы определенной последовательностью символов */
            lc.fields[0].setText("read?one");
			/* Запуск программы */
            lc.calculate();
			/* Сравнение результата, выдаваемого программой, с ожидаемым значением */
            Assert.assertTrue("8".equals(lc.fields[1].getText()));
        }
		/* Код, выполняемый при возникновении ошибок в процессе выполнения теста */
        catch(Exception e){
			/* Неудачное завершение выполнения теста */
            Assert.fail("Проверьте правильность входных значений");
        }
    }
}
