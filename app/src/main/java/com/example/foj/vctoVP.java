package com.example.foj;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;


import androidx.appcompat.app.AppCompatActivity;

public class vctoVP extends AppCompatActivity {
    Button btnVP;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.vctovp);

        btnVP = (Button) findViewById(R.id.btnVP);

        btnVP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(vctoVP.this,myVP.class);
                startActivity(intent);
            }
        });

        final ArrayAdapter adapter = (new ArrayAdapter(this,android.R.layout.simple_list_item_multiple_choice,subject_select));

        final ListView listview = (ListView)findViewById(R.id.LV1);
        listview.setAdapter(adapter);
    }
    // adapter 데이터와 리스트뷰 연결하여 그 폼에 맞게 나타내주는 역할
    // 디자인 적용 - R.layout.simple_list_item가 리스트뷰의 커스텀 디자인이 됨
    // 이 어댑터를 리스트뷰에 적용

    //String 배열 저장해야 하므로 ArrayAdapter 사용 - ArrayAdapter(Context context, int resource, T[] objects)
    // context - 어플리케이션 전역 환경 정보에 대한 Interface // 여기서는 this
    // resource - view로 매핑될 리소스 id / textview 위젯으로 구성된 ListView 아이템 리소스 id
    // objects - 배열로 선언된 사용자 데이터
    final String[] subject_select = {"회사명","회사 주소","사업자번호","생산보고서","회사 ICX 계좌","책임 매니저 이름","매니저 메일","상세 설명"};

}
