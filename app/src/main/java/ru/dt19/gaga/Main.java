package ru.dt19.gaga;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.Toast;
import android.widget.TextView;
import android.view.View;
import java.util.Random;

import static android.widget.TextView.*;


public class Main extends ActionBarActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void onMyButtonClick(View view)
    {
        Random r = new Random();
        int i = r.nextInt(46);
        String[] vopros = new String[46];
        vopros[0] = "Приходилось ли тебе прятаться с сигаретой за углом школы?";
        vopros[1] = "Приходилось ли тебе играть на уроках в азартные игры?";
        vopros[2] = "Хотелось ли тебе когда-нибудь сжечь школьный журнал?";
        vopros[3] = "Часто ли ты сбегал (а) с уроков?";
        vopros[4] = "Списывал(а) ли ты домашние задания?";
        vopros[5] = "Подкладывал(а) ли ты кнопки на стулья?";
        vopros[6] = "Часто ли ты влюблялся?";
        vopros[7] = "Спал(а) ли ты на уроках?";
        vopros[8] = "Подглядывал(а) ли ты в раздевалке?";
        vopros[9] = "Часто ли вызывали твоих родителей в школу?";
        vopros[10] = "Пользовался(лась) ли ты шпаргалками?";
        vopros[11] = "Исправлял(а) ли ты двойки в своём дневнике?";
        vopros[12] = "Подглядывал(а) ли ты контрольные у соседки?";
        vopros[13] = "Прятал(а) ли ты свой дневник от родителей?";
        vopros[14] = "Разбивал(а) ли ты окна в школе?";
        vopros[15] = "Хотели бы вы вернуться в школу?";
        vopros[16] = "Отправили бы вы своего ребенка в школу?";
        vopros[17] = "Распивали ли вы спиртные напитки в школе?";
        vopros[18] = "Какие 3 учителя запомнились больше всего?";
        vopros[19] = "Какой был любимый урок и почему?";
        vopros[20] = "Какое было хобби во время учебе в школе?";
        vopros[21] = "С кем сидели за партой?";
        vopros[22] = "Чему вас научила школа?";
        vopros[23] = "Самый счастливый момент за последние 8 лет?";
        vopros[24] = "С каким интересным человеком познакомился и чему у него научился?";
        vopros[25] = "Какой самый полезный навык ты приобрел?";
        vopros[26] = "Какая книга понравилась больше всего?";
        vopros[27] = "Какой день хочется повторить еще раз и почему?";
        vopros[28] = "Какая самая большая мечта?";
        vopros[29] = "Представь тебе дают 10 миллионов, что будешь с ними делать?";
        vopros[30] = "Что нравится на работе?";
        vopros[31] = "Где работаешь и чем хороша твоя профессия?";
        vopros[32] = "Работа твой мечты или чем бы ты хотел заниматься?";
        vopros[33] = "Чтобы бы ты хотел изменить в своей жизни?";
        vopros[34] = "Если бы ты стал знаменитым то в какой области хотел?";
        vopros[35] = "Где бы хотел жить?";
        vopros[36] = "Каким ты себе представляешь идеальный день?";
        vopros[37] = "За что ты благодарен жизни?";
        vopros[38] = "Чтобы вы изменили в своем воспитании?";
        vopros[39] = "Что больше всего цените в своих друзьях?";
        vopros[40] = "Когда и от чего вы последний раз плакали?";
        vopros[41] = "Когда и от чего в последний раз смеялись?";
        vopros[42] = "Что вы любите?";
        vopros[43] = "Если бы вам разрешили изменить 1 вещь в мире, чтобы это было?";
        vopros[44] = "Чтобы вы очень хотели сделать, но так и не сделали? Что останавливает?";
        vopros[45] = "Какое твое заветное желание исполнилось?";
        Toast.makeText(this, vopros[i], Toast.LENGTH_LONG).show();
    }

    public void onMyButtonClickNakaz(View view)
    {
        Random r = new Random();
        int i = r.nextInt(8);
        String[] nakaz = new String[8];
        nakaz[0] = "Выпить рюмку залпом без закуски";
        nakaz[1] = "Встать и стоять 10 мин";
        nakaz[2] = "Необходимо всех разговорить, а другие должны игнорировать тебя в течение 10 мин";
        nakaz[3] = "Сидишь с закрытыми глазами 5 минут";
        nakaz[4] = "Другие загадывают тебе 1 желание и ты должен его выполнить";
        nakaz[5] = "Рассказываешь 2 стихотворения";
        nakaz[6] = "Рассказываешь анекдот";
        nakaz[7] = "Спеть песню про дружбу";
        Toast.makeText(this, nakaz[i], Toast.LENGTH_LONG).show();
    }
}
