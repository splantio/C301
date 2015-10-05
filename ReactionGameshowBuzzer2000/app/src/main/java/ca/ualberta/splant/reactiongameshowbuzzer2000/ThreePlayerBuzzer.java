package ca.ualberta.splant.reactiongameshowbuzzer2000;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

// This class is the class that handles clicks for the 3player
// buzz activity
public class ThreePlayerBuzzer extends GameShowActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_three_player_buzzer);
        super.player1.setState(1);
        super.player2.setState(1);
        super.player3.setState(1);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_three_player_buzzer, menu);
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

    public void player1Click(View view) {
        super.player1.incrementBuzzClicks();
        // Alert that player1 buzzed first
        super.alertWhoBuzzed(player1.getName(), player1.getThreePlayerClicks());
    }

    public void player2Click(View view) {
        super.player2.incrementBuzzClicks();
        // Alert that player2 buzzed first
        super.alertWhoBuzzed(player2.getName(), player2.getThreePlayerClicks());
    }

    public void player3Click(View view) {
        super.player3.incrementBuzzClicks();
        // Alert that player3 buzzed first
        super.alertWhoBuzzed(player3.getName(),player3.getThreePlayerClicks());
    }
}
