package com.keeeweee.abuse;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import android.app.Activity;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import com.keeeweee.abuse.chat.ChatMsgEntity;
import com.keeeweee.abuse.chat.ChatMsgViewAdapter;

public class MainActivity extends Activity implements OnClickListener {

	private Button mBtnSend;// ����btn
	private Button mBtnBack;// ����btn
	private EditText mEditTextContent;
	private ListView mListView;
	private ChatMsgViewAdapter mAdapter;// ��Ϣ��ͼ��Adapter
	private List<ChatMsgEntity> mDataArrays = new ArrayList<ChatMsgEntity>();// ��Ϣ��������

	private String girl = "����";
	private String myself = "��";
	private final static int COUNT = 5;// ��ʼ����������

	private String chatContent1 = "��1";
	private String chatContent2 = "��2";
	private String chatContent3 = "��3";
	private String chatContent4 = "��4";
	private String chatContent5 = "��5";
	private String chatContent6 = "��6";
	private String chatContent7 = "��7";
	private String chatContent8 = "��8";
	private String chatContent9 = "��9";
	private String chatContent10 = "��10";
	private String chatContent11 = "��11";
	private String chatContent12 = "��12";
	private String chatContent13 = "��13";
	private String chatContent14 = "��14";
	private String chatContent15 = "��15";
	private String chatContent16 = "��16";
	private String chatContent17 = "��17";
	private String chatContent18 = "��18";
	private String chatContent19 = "��19";
	private String chatContent20 = "��20";

	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		initView();// ��ʼ��view
		initData();// ��ʼ������
		mListView.setSelection(mAdapter.getCount() - 1);
	}

	/**
	 * ��ʼ��view
	 */
	public void initView() {
		mListView = (ListView) findViewById(R.id.listview);
		mBtnSend = (Button) findViewById(R.id.btn_send);
		mBtnSend.setOnClickListener(this);
		mBtnBack = (Button) findViewById(R.id.btn_back);
		mBtnBack.setOnClickListener(this);
		mEditTextContent = (EditText) findViewById(R.id.et_sendmessage);
	}

	private String[] chatContentArray = new String[] { chatContent1,
			chatContent2, chatContent3, chatContent4, chatContent5,
			chatContent6, chatContent7, chatContent8, chatContent9,
			chatContent10, chatContent11, chatContent12, chatContent13,
			chatContent14, chatContent15, chatContent16, chatContent17,
			chatContent18, chatContent19, chatContent20 };

	// private String[] msgArray = new String[] { "�д���", "�У����أ�", "��Ҳ��", "���ϰ�",
	// "�򰡣���Ŵ󰡣�", "��TMզ���Ŵ��أ���������ͷ����CAO�������B", "2B������", "���...",
	// "����ȥ���ɰ�ҹ�ɣ�", "��ëƬ��", "����һ��Ѱ�~����ûƬ��", "OK,���𣡣�", "�д���", "�У����أ�",
	// "��Ҳ��", "���ϰ�", "�򰡣���Ŵ󰡣�", "��TMզ���Ŵ��أ���������ͷ����CAO�������B", "2B������",
	// "���...", "����ȥ���ɰ�ҹ�ɣ�", "��ëƬ��", "����һ��Ѱ�~����ûƬ��", "OK,���𣡣�" };

	private String[] msgArrayLeft = new String[] {
			"hi,�����������ܸ�����ʶ��Ŷ����",
			"������",
			"�������Ҹ��㽲�����Ӱ�\nһũ�����˼�ͷ��ϣ������󣬿��������Ⱥ����⣬���ܺ�������û��һͷ���У� ���Ǿʹ�绰����ҽ��æ����ҽ������Ҫ�����˹��ܾ��� ũ������Ͳ�֪������ʲ����˼�����ֲ����ñ��˿����Լ���֪��������ֻ������ҽ�� �β��ܿ��������ˡ���ҽ˵��ֻҪ���������ཬ������������ͣ�������˵�����ǻ����ˡ� ũ����˵绰��˼����һ�£��ó��Ľ����ǣ��˹��ܾ�����Ҫ������Щ���ܾ��������� ����Щ��Ϥ��װ�Ͽ���������С����������������Ǹ���һ�飬���º��ְ�����ȫ ���������� �ڶ���������ũ���ߵ���Ȧ����������һ����վ��������룬�϶��ǵ�һ��û�� �ɹ������������ÿ�����������С�������Σ�Ϊ�˱�����������������ؽ����Ǹ� �������Ρ� �ڶ���һ�磬��������Ȧ����������վ�����û�����������룬����һ�ΰɣ��� ���ְ���װ������������С�������������һ���ʱ�䣬һ����һ��ذ�������Щ�� �ص�����۵�һͷ���ڴ��ϣ���˯��ȥ�� �ڶ��죬 ���������˴��ˣ�������������ȥ�������Ƿ��Ѿ������ཬ���ˡ������� ��������������������ȫ���ܵ��˿������ˣ�����һͷ���ڲ��ͷ�������Ͱ������ء���", };

	private String[] msgArrayRight = new String[] { "�ۣ���Ůô��",
			"�������£������Ҹ������ң�Խ��Խ�ã�" };

	private String[] dataArray = new String[] { "2012-09-22 18:00:02",
			"2012-09-22 18:10:22", "2012-09-22 18:11:24",
			"2012-09-22 18:20:23", "2012-09-22 18:30:31",
			"2012-09-22 18:35:37", "2012-09-22 18:40:13",
			"2012-09-22 18:50:26", "2012-09-22 18:52:57",
			"2012-09-22 18:55:11", "2012-09-22 18:56:45",
			"2012-09-22 18:57:33", };

	/**
	 * ģ�������Ϣ��ʷ��ʵ�ʿ������Դ����ݿ��ж���
	 */
	// public void initData() {
	// for (int i = 0; i < COUNT; i++) {
	// ChatMsgEntity entity = new ChatMsgEntity();
	// entity.setDate(dataArray[i]);
	// if (i % 2 == 0) {
	// entity.setName("�׸���");
	// entity.setMsgType(true);// �յ�����Ϣ
	// } else {
	// entity.setName("��");
	// entity.setMsgType(false);// �Լ����͵���Ϣ
	// }
	// entity.setMessage(msgArray[i]);
	// mDataArrays.add(entity);
	// }
	//
	// mAdapter = new ChatMsgViewAdapter(this, mDataArrays);
	// mListView.setAdapter(mAdapter);
	// }

	public void initData() {
		int j1 = 0;
		int j2 = 0;
		for (int i = 0; i < COUNT; i++) {
			ChatMsgEntity entity = new ChatMsgEntity();
			entity.setDate(dataArray[i]);
			if (i % 2 == 0) {
				entity.setName(girl);
				entity.setMsgType(true);// �յ�����Ϣ
				entity.setMessage(msgArrayLeft[j1++]);
			} else {
				entity.setName(myself);
				entity.setMsgType(false);// �Լ����͵���Ϣ
				entity.setMessage(msgArrayRight[j2++]);
			}
			mDataArrays.add(entity);
		}

		mAdapter = new ChatMsgViewAdapter(this, mDataArrays);
		mListView.setAdapter(mAdapter);
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.btn_send:// ���Ͱ�ť����¼�
			send();
			break;
		case R.id.btn_back:// ���ذ�ť����¼�
			finish();// ����,ʵ�ʿ����У����Է���������
			break;
		}
	}

	/**
	 * ������Ϣ
	 */
	private void send() {
		String contString = mEditTextContent.getText().toString();
		if (contString.length() > 0) {
			ChatMsgEntity entity = new ChatMsgEntity();
			entity.setName(myself);
			entity.setDate(getDate());
			entity.setMessage(contString);
			entity.setMsgType(false);
			mDataArrays.add(entity);
			mAdapter.notifyDataSetChanged();// ֪ͨListView�������ѷ����ı�
			mEditTextContent.setText("");// ��ձ༭������
			mListView.setSelection(mListView.getCount() - 1);// ����һ����Ϣʱ��ListView��ʾѡ�����һ��
			new TimerTask().execute();
		}
	}

	private void girlSay() {
		// ����1��20�������
		long Temp = Math.round(Math.random() * 19 + 1);
		ChatMsgEntity entity = new ChatMsgEntity();
		entity.setName(girl);
		entity.setDate(getDate());
		entity.setMessage(chatContentArray[(int) Temp]);
		entity.setMsgType(true);
		mDataArrays.add(entity);
		mAdapter.notifyDataSetChanged();// ֪ͨListView�������ѷ����ı�
		mEditTextContent.setText("");// ��ձ༭������
		mListView.setSelection(mListView.getCount() - 1);// ����һ����Ϣʱ��ListView��ʾѡ�����һ��
	}

	private class TimerTask extends AsyncTask<String, Void, Boolean> {
		@Override
		protected Boolean doInBackground(String... params) {
			try {
				// ����1��20�������
				long temp = Math.round(Math.random() * 9 + 1);
				Thread.sleep(temp * 500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return true;
		}

		protected void onPostExecute(Boolean result) {
			girlSay();
		}
	}

	/**
	 * ������Ϣʱ����ȡ��ǰ�¼�
	 * 
	 * @return ��ǰʱ��
	 */
	private String getDate() {
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		return format.format(new Date());
	}
}

// public class MainActivity extends Activity {
//
// /** Called when the activity is first created. */
// @Override
// public void onCreate(Bundle savedInstanceState) {
// super.onCreate(savedInstanceState);
// setContentView(R.layout.activity_main);
//
// }
// }
// public class MainActivity extends ActionBarActivity {
//
// @Override
// protected void onCreate(Bundle savedInstanceState) {
// super.onCreate(savedInstanceState);
// setContentView(R.layout.activity_main);
//
// if (savedInstanceState == null) {
// getSupportFragmentManager().beginTransaction()
// .add(R.id.container, new PlaceholderFragment()).commit();
// }
// }
//
// @Override
// public boolean onCreateOptionsMenu(Menu menu) {
//
// // Inflate the menu; this adds items to the action bar if it is present.
// getMenuInflater().inflate(R.menu.main, menu);
// return true;
// }
//
// @Override
// public boolean onOptionsItemSelected(MenuItem item) {
// // Handle action bar item clicks here. The action bar will
// // automatically handle clicks on the Home/Up button, so long
// // as you specify a parent activity in AndroidManifest.xml.
// int id = item.getItemId();
// if (id == R.id.action_settings) {
// return true;
// }
// return super.onOptionsItemSelected(item);
// }
//
// /**
// * A placeholder fragment containing a simple view.
// */
// public static class PlaceholderFragment extends Fragment {
//
// public PlaceholderFragment() {
// }
//
// @Override
// public View onCreateView(LayoutInflater inflater, ViewGroup container,
// Bundle savedInstanceState) {
// View rootView = inflater.inflate(R.layout.fragment_main, container,
// false);
// return rootView;
// }
// }
//
// }
