package me.lancer.spineruntimesdemo;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import me.lancer.spineruntimesdemo.activity.AlienActivity;
import me.lancer.spineruntimesdemo.activity.BoneActivity;
import me.lancer.spineruntimesdemo.activity.DragonActivity;
import me.lancer.spineruntimesdemo.activity.GoblinActivity;
import me.lancer.spineruntimesdemo.activity.HumanOidActivity;
import me.lancer.spineruntimesdemo.activity.PowerUpActivity;
import me.lancer.spineruntimesdemo.activity.SpeedyActivity;
import me.lancer.spineruntimesdemo.activity.SpineBoyActivity;

public class MainActivity extends AppCompatActivity {

    Button btnSpineBoy, btnGoblin, btnHumanOid, btnSpeedy, btnAlien, btnBone, btnPowerUp, btnDragon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSpineBoy = (Button) findViewById(R.id.btn_spine_boy);
        btnSpineBoy.setOnClickListener(vOnClickListener);

        btnGoblin = (Button) findViewById(R.id.btn_goblin);
        btnGoblin.setOnClickListener(vOnClickListener);

        btnHumanOid = (Button) findViewById(R.id.btn_human_oid);
        btnHumanOid.setOnClickListener(vOnClickListener);

        btnSpeedy = (Button) findViewById(R.id.btn_speedy);
        btnSpeedy.setOnClickListener(vOnClickListener);

        btnAlien = (Button) findViewById(R.id.btn_alien);
        btnAlien.setOnClickListener(vOnClickListener);

        btnBone = (Button) findViewById(R.id.btn_bone);
        btnBone.setOnClickListener(vOnClickListener);

        btnPowerUp = (Button) findViewById(R.id.btn_power_up);
        btnPowerUp.setOnClickListener(vOnClickListener);

        btnDragon = (Button) findViewById(R.id.btn_dragon);
        btnDragon.setOnClickListener(vOnClickListener);
    }

    View.OnClickListener vOnClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            if (view == btnSpineBoy) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this, SpineBoyActivity.class);
                startActivity(intent);
            } else if (view == btnGoblin) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this, GoblinActivity.class);
                startActivity(intent);
            } else if (view == btnHumanOid) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this, HumanOidActivity.class);
                startActivity(intent);
            } else if (view == btnSpeedy) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this, SpeedyActivity.class);
                startActivity(intent);
            } else if (view == btnAlien) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this, AlienActivity.class);
                startActivity(intent);
            } else if (view == btnBone) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this, BoneActivity.class);
                startActivity(intent);
            } else if (view == btnPowerUp) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this, PowerUpActivity.class);
                startActivity(intent);
            } else if (view == btnDragon) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this, DragonActivity.class);
                startActivity(intent);
            }
        }
    };
}
