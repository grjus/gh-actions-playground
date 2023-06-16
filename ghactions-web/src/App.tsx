import {useEffect, useState} from 'react'
import reactLogo from './assets/react.svg'
import viteLogo from '/vite.svg'
import './App.css'


type BffResponse = {
    value:string
}

function App() {

    const [greeting, setGreeting] = useState<BffResponse|null>(null)


    useEffect(()=>{
        fetch("api/greeting").then(res=>res.json()).then((output:BffResponse)=>{
            setGreeting(output)
        })
    },[])

  return (
    <>
      <div>
        <a href="https://vitejs.dev" target="_blank">
          <img src={viteLogo} className="logo" alt="Vite logo" />
        </a>
        <a href="https://react.dev" target="_blank">
          <img src={reactLogo} className="logo react" alt="React logo" />
        </a>
      </div>
      <p>BFF greeting</p>
        <h1>{ greeting?.value }</h1>
    </>
  )
}

export default App
