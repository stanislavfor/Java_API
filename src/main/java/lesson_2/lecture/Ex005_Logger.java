package lesson_2.lecture;

import java.io.IOException;
import java.util.logging.*;

// Логирование:
// Логи содержат системную информацию работы программного или аппаратного комплекса.
// В них записываются действия разного приоритета от пользователя, или программного продукта.
// Процесс ведения логов называют “логированием” (журналированием).
// Использование -
// Logger logger = Logger.getLogger()
// Уровни важности -
// INFO, DEBUG, ERROR, WARNING и др.
// Вывод -
// ConsoleHandler info = new ConsoleHandler();
// log.addHandler(info);
// Формат вывода: структурированный, абы как* -
// XMLFormatter, SimpleFormatter

public class Ex005_Logger {
    public static void main(String[] args) throws IOException {

        Logger logger = Logger.getLogger(Ex005_Logger.class.getName());
        logger.setLevel(Level.INFO);

//        ConsoleHandler ch = new ConsoleHandler();
//        logger.addHandler(ch);
//        ch.setFormatter(sFormat);
//       // < - or ->
//        ch.setFormatter(xml);

        FileHandler fh = new FileHandler("log.xml");
        // FileHandler fh = new FileHandler("log.txt");
        logger.addHandler(fh);
        // XMLFormatter xml = new XMLFormatter();
        SimpleFormatter sFormat = new SimpleFormatter();
        // fh.setFormatter(xml);
        fh.setFormatter(sFormat);

        logger.log(Level.WARNING, "Тестовое логирование (=1)");
        logger.info("Тестовое логирование (=2)");

    }
}







