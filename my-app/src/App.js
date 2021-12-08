import { useState } from "react";
import styles from "./App.module.css"

function App() {
  const [id, setId] = useState("");
  const [ott, setOtt] = useState("");
  const [title, setTitle] = useState("");
  const [score, setScore] = useState(0);
  const [text, setText] = useState("");


  const idChange = (e) => {
    setId(e.target.value);
  }

  const ottChange = (e) => {
    setOtt(e.target.value);
  }

  const titleChange = (e) => {
    setTitle(e.target.value);
  }


  const scoreChange = (e) => {
    setScore(e.target.value);
  }

  const textChange = (e) => {
    setText(e.target.value);
  }

  const submitHandler = (e) => {
    e.preventDefault()
    console.log(body);
  }

  let body = {
    id : {id},
    ott : {ott},
    title : {title},
    score : {score},
    text : {text},
  }

  return (
    <form onSubmit={submitHandler} >
      <h1>리뷰</h1>
        <div className={styles.body}>

          <label htmlFor="id">유저 ID</label>
          <input onChange={idChange} id="id" type="text" />

          <label htmlFor="OTT">OTT 이름</label>
          <input onChange={ottChange} id="OTT" type="text" />

          <label htmlFor="contentTitle">콘텐츠 제목</label>
          <input onChange={titleChange} id="contentTitle" type="text" />

          <label>평점</label>
          <select onChange={scoreChange}>
            <option>1</option>
            <option>2</option>
            <option>3</option>
            <option>4</option>
            <option>5</option>
          </select>

          <label htmlFor="reviewText">리뷰</label>
          <input onChange={textChange} id="reviewText"type="text" />

          <button className={styles.button} type="submit">리뷰 작성</button>
        </div>
    </form>
  );
}

export default App;
