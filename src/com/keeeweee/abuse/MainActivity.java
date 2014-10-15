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

	private Button mBtnSend;// 发送btn
	private Button mBtnBack;// 返回btn
	private EditText mEditTextContent;
	private ListView mListView;
	private ChatMsgViewAdapter mAdapter;// 消息视图的Adapter
	private List<ChatMsgEntity> mDataArrays = new ArrayList<ChatMsgEntity>();// 消息对象数组

	private String girl = "紫轩";
	private String myself = "我";
	private final static int COUNT = 5;// 初始化数组总数

	private String chatContent1 = "我1";
	private String chatContent2 = "我2";
	private String chatContent3 = "我3";
	private String chatContent4 = "我4";
	private String chatContent5 = "我5";
	private String chatContent6 = "我6";
	private String chatContent7 = "我7";
	private String chatContent8 = "我8";
	private String chatContent9 = "我9";
	private String chatContent10 = "我10";
	private String chatContent11 = "我11";
	private String chatContent12 = "我12";
	private String chatContent13 = "我13";
	private String chatContent14 = "我14";
	private String chatContent15 = "我15";
	private String chatContent16 = "我16";
	private String chatContent17 = "我17";
	private String chatContent18 = "我18";
	private String chatContent19 = "我19";
	private String chatContent20 = "我20";

	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		initView();// 初始化view
		initData();// 初始化数据
		mListView.setSelection(mAdapter.getCount() - 1);
	}

	/**
	 * 初始化view
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

	// private String[] msgArray = new String[] { "有大吗", "有！你呢？", "我也有", "那上吧",
	// "打啊！你放大啊！", "你TM咋不放大呢？留大抢人头啊？CAO！你个菜B", "2B不解释", "尼滚...",
	// "今晚去网吧包夜吧？", "有毛片吗？", "种子一大堆啊~还怕没片？", "OK,搞起！！", "有大吗", "有！你呢？",
	// "我也有", "那上吧", "打啊！你放大啊！", "你TM咋不放大呢？留大抢人头啊？CAO！你个菜B", "2B不解释",
	// "尼滚...", "今晚去网吧包夜吧？", "有毛片吗？", "种子一大堆啊~还怕没片？", "OK,搞起！！" };

	private String[] msgArrayLeft = new String[] {
			"hi,我是紫轩，很高兴认识你哦～～",
			"讨厌啦",
			"真的嘛？那我给你讲个段子吧\n一农夫买了几头猪，希望养大后，可以做火腿和腌肉，数周后，他发现没有一头猪怀孕， 于是就打电话请兽医帮忙，兽医告诉他要采用人工受精。 农夫根本就不知道那是什麽意思，但又不想让别人看出自己无知，所以他只问了兽医如 何才能看出猪怀孕了。兽医说，只要看到猪在泥浆里躺下来并不停打滚，就说明它们怀孕了。 农夫挂了电话，思讨了一下，得出的结论是：人工受精就是要他给这些猪受精。于是他 将这些猪悉数装上卡车，拉倒小树林里，并挨个把它们干了一遍，完事后，又把它们全 部拉回来。 第二天醒来后，农夫走到猪圈，看到猪都仍一个个站在那里，他想，肯定是第一次没有 成功，于是他又用卡车把猪拉到小树林里，这次，为了保险起见，他很卖力地将它们各 干了两次。 第二天一早，他起身到猪圈，发现猪还是站在那里，没动静，他心想，在试一次吧，于 是又把猪装到卡车上拉到小树林里，用了整整一天的时间，一遍又一遍地挨个干这些猪， 回到家里，累得一头倒在床上，昏睡过去。 第二天， 他几乎起不了床了，于是让他老婆去看看猪是否都已经躺在泥浆里了。他老婆 回来告诉他：“不，猪全都跑到了卡车上了，其中一头还在不耐烦地用嘴巴按喇叭呢。”", };

	private String[] msgArrayRight = new String[] { "哇，美女么？",
			"聊聊天呗，我想找个人骂我，越狠越好！" };

	private String[] dataArray = new String[] { "2012-09-22 18:00:02",
			"2012-09-22 18:10:22", "2012-09-22 18:11:24",
			"2012-09-22 18:20:23", "2012-09-22 18:30:31",
			"2012-09-22 18:35:37", "2012-09-22 18:40:13",
			"2012-09-22 18:50:26", "2012-09-22 18:52:57",
			"2012-09-22 18:55:11", "2012-09-22 18:56:45",
			"2012-09-22 18:57:33", };

	/**
	 * 模拟加载消息历史，实际开发可以从数据库中读出
	 */
	// public void initData() {
	// for (int i = 0; i < COUNT; i++) {
	// ChatMsgEntity entity = new ChatMsgEntity();
	// entity.setDate(dataArray[i]);
	// if (i % 2 == 0) {
	// entity.setName("白富美");
	// entity.setMsgType(true);// 收到的消息
	// } else {
	// entity.setName("我");
	// entity.setMsgType(false);// 自己发送的消息
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
				entity.setMsgType(true);// 收到的消息
				entity.setMessage(msgArrayLeft[j1++]);
			} else {
				entity.setName(myself);
				entity.setMsgType(false);// 自己发送的消息
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
		case R.id.btn_send:// 发送按钮点击事件
			send();
			break;
		case R.id.btn_back:// 返回按钮点击事件
			finish();// 结束,实际开发中，可以返回主界面
			break;
		}
	}

	/**
	 * 发送消息
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
			mAdapter.notifyDataSetChanged();// 通知ListView，数据已发生改变
			mEditTextContent.setText("");// 清空编辑框数据
			mListView.setSelection(mListView.getCount() - 1);// 发送一条消息时，ListView显示选择最后一项
			new TimerTask().execute();
		}
	}

	private void girlSay() {
		// 产生1到20的随机数
		long Temp = Math.round(Math.random() * 19 + 1);
		ChatMsgEntity entity = new ChatMsgEntity();
		entity.setName(girl);
		entity.setDate(getDate());
		entity.setMessage(chatContentArray[(int) Temp]);
		entity.setMsgType(true);
		mDataArrays.add(entity);
		mAdapter.notifyDataSetChanged();// 通知ListView，数据已发生改变
		mEditTextContent.setText("");// 清空编辑框数据
		mListView.setSelection(mListView.getCount() - 1);// 发送一条消息时，ListView显示选择最后一项
	}

	private class TimerTask extends AsyncTask<String, Void, Boolean> {
		@Override
		protected Boolean doInBackground(String... params) {
			try {
				// 产生1到20的随机数
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
	 * 发送消息时，获取当前事件
	 * 
	 * @return 当前时间
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
