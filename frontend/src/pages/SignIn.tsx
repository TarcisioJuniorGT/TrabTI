import '../styles/global.css';
import'../styles/signin.css';
import videoBg from "../assets/videos/videoBg.mp4";
import logo from"../assets/images/selo-mais-verde-eurofarma.png"
import { Button } from '../components/Button';


export default function SignIn() {
  return (
    <>
      <div id="teste" className="min-h-full  flex items-center  justify-center py-12 px-4 sm:px-6 lg:px-8">
        <video  
          src={videoBg}  
          autoPlay 
          loop 
          muted >
        </video>

        <div className="max-w-xs w-full space-y-8">
          <div className='flex items-center  justify-center'>
            <img className="h-20 " src={logo} alt="" />
          </div>
          <div>
            <h2 id='title-entrar' className="mt-6 text-center text-2xl font-extrabold">Entrar</h2>
          </div>
          
          <form className="mt-8 space-y-6" action="#" method="POST">
            <input type="hidden" name="remember" defaultValue="true" />
            <div className="rounded-md shadow-sm -space-y-px">
              <div>
                <label htmlFor="email-address" className="sr-only">
                  Email 
                </label>
                <input
                  id="email-address"
                  name="email"
                  type="email"
                  autoComplete="email"
                  required
                  className="appearance-none rounded-none relative block w-full px-3 py-2 border border-gray-300 placeholder-gray-500 text-gray-900 rounded-t-md focus:outline-none focus:ring-indigo-500 focus:border-indigo-500 focus:z-10 sm:text-sm"
                  placeholder="Email "
                />
              </div>
              <div>
                <label htmlFor="password" className="sr-only">
                  Senha
                </label>
                <input
                  id="password"
                  name="password"
                  type="password"
                  autoComplete="current-password"
                  required
                  className="appearance-none rounded-none relative block w-full px-3 py-2 border border-gray-300 placeholder-gray-500 text-gray-900 rounded-b-md focus:outline-none focus:ring-indigo-500 focus:border-indigo-500 focus:z-10 sm:text-sm"
                  placeholder="Senha"
                />
              </div>
            </div>

            <div className="flex items-center justify-between">
              <div className="flex items-center">
                <input
                  id="remember-me"
                  name="remember-me"
                  type="checkbox"
                  className="h-4 w-4 text-indigo-600 focus:ring-indigo-500 border-gray-300 rounded"
                />
                <label id='manter-conectado' htmlFor="remember-me" className="ml-2 block text-sm ">
                  Manter conectado
                </label>
              </div>

              <div className="text-sm">
                <a href="#" id='forget-password' className="font-medium text-indigo-600 hover:text-indigo-500">
                  Esqueceu sua senha?
                </a>
              </div>
            </div>

            <div>
              <Button  
                id='button-login'
                type='submit'
                className='group relative w-full flex justify-center py-2 px-4 border border-transparent text-sm font-medium rounded-md text-white bg-indigo-600 hover:bg-indigo-700 focus:outline-none focus:ring-2 focus:ring-offset-2 focus:ring-indigo-500'>
                <span className="absolute left-0 inset-y-0 flex items-center pl-3">
                </span>
                Entrar
              </Button>
            </div>
          </form>
        </div>
      </div>
    </>
  )
}
