import styles from "./App.module.css"

function App() {
  return (
    <form>
      <h1>리뷰</h1>
        <div className={styles.body}>

          <label for="id">유저 ID</label>
          <input id="id" type="text" />

          <label for="OTT">OTT 이름</label>
          <input id="OTT" type="text" />

          <label for="contentTitle">콘텐츠 제목</label>
          <input id="contentTitle" type="text" />

          <label>평점</label>
          <select>
            <option>1</option>
            <option>2</option>
            <option>3</option>
            <option>4</option>
            <option>5</option>
          </select>

          <label for="reviewText">리뷰</label>
          <input id="reviewText"type="text" />

          <button className={styles.button} type="submit">리뷰 작성</button>
        </div>
    </form>
  );
}

export default App;
